/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe.TableauPartiel;
import classe.coupe.Coupe;
import classe.erreur.ElementNonPresent;
import classe.erreur.IndexHorsPorte;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author janindancause
 * @param <E>
 */
public class TableauPartiel <E> {
    private E []tableau;
  
    /**
     *constructeur 1
     * @param a_tableau
     */
public TableauPartiel( E[] a_tableau ){
    tableau=a_tableau.clone();  
}

    /**
     *constructeur deux
     * @param a_tableauPartiel
     */
public TableauPartiel( TableauPartiel<E> a_tableauPartiel ){
    tableau=a_tableauPartiel.elements(); 
}
    
     /**
     *constructeur trois
     *
     */
       public TableauPartiel(  ){}
       
    /**
     *envoie le contenue du tableau à une position précise
     * @param a_element ce qui est chercher
     * @return 
     * @throws ElementNonPresent
     */
public int position( E a_element ) throws ElementNonPresent{ 
        List<E> liste = Arrays.asList(tableau);

        if(!contient(a_element)){
        throw new ElementNonPresent("\nL'élément rechercher n'existe pas");
        }
    return liste.indexOf(a_element);
}

    /**
     *indique si une donnée est contenue dans le tableau
     * @param a_element
     * @return
     */
public boolean contient( E a_element ){
    return Arrays.asList(tableau).contains(a_element) ;
}

    /**
     * coupe un tableau générique et envoi un nouveau tableau coupé
     * @param a_coupe indique comment le tableau doit être coupé
     * @return
     * @throws IndexHorsPorte
     */
public TableauPartiel<E> coupe( Coupe a_coupe )throws IndexHorsPorte {

    int debut=a_coupe.getDebut();
    int fin=a_coupe.getFin(tableau.length);
    
    if(valider(debut,tableau.length)){
    throw new IndexHorsPorte("\nl'index de début est erroné");
    }
    
    if(valider(fin,tableau.length)){
    throw new IndexHorsPorte("\nl'index de fin est erroné");
    }
  
    TableauPartiel<E> tabTemporaire=new TableauPartiel();
    List liste=Arrays.asList(tableau);
    tabTemporaire.tableau=(E[])liste.subList(debut, fin).toArray();
     
return  tabTemporaire;
}
 
    /**
     *envoie une copie du tableau
     * @return
     */
public E[] elements(){ 
    return  tableau.clone();
}

    /**
     *
     * @return
     */
    public boolean estVide(){
    return (tableau == null || tableau.length==0);
}

    /**
     *donne la donnée à une position précise
     * @param a_position
     * @return
     * @throws IndexHorsPorte
     */
public E get( int a_position ) throws IndexHorsPorte {

    if(estVide()){  
        throw new IndexHorsPorte("\nle tableau est vide"); 
    }
    if(tableau.length<a_position || a_position<0 )
    {
    throw new IndexHorsPorte("\nLa position n'existe pas"); 
    }
   return tableau[a_position];
}

    /**
     *permet de changer tout les occurances par une nouvelle donnée
     * @param a_ancien donnée a modifier
     * @param a_nouveau donnée a placer en remplacement de l'ancien
     * @throws ElementNonPresent
     */
public void remplacer( E a_ancien,E a_nouveau ) throws ElementNonPresent{
    if(contient(a_ancien)){
        while(contient(a_ancien)){          
            try {
                set(position(a_ancien),a_nouveau);
            } catch (IndexHorsPorte e) {
                Logger.getLogger(TableauPartiel.class.getName()).log(Level.SEVERE, null, e);   
            }         
        }}else{
    throw new ElementNonPresent("\nElement absent");
    }
}

    /**
     *change une valeur dans le tableau à une position précise
     * @param a_position index a modifier
     * @param a_element donnée a placer à l'index demandé
     * @throws IndexHorsPorte
     */
public void set( int a_position, E a_element ) throws IndexHorsPorte{  
    List<E> liste = Arrays.asList(tableau);
    if(a_position >= 0 && a_position < taille()){
        liste.set(a_position, a_element);
    }else{
    throw new IndexHorsPorte("\nDépassement de l'index");
    }
}

    /**
     *envoie la longueur du tableau
     * @return
     */
public int taille(){
    return tableau.length;
} 

    /**
     *envoie le contenue du tableau pour être affiché
     * @return
     * @throws IndexHorsPorte
     */
 public String ToString()throws IndexHorsPorte{
     String tempString="";
     for(int i=0;i<tableau.length;++i){
        
         try {
             tempString=tempString+get(i)+" | ";
         } catch (IndexHorsPorte e) {
                throw new IndexHorsPorte();
         }

     }
 return tempString;
 } 
 
    /**
     *Valide les index début et fin
     * @param x
     * @param y
     * @return
     */
    public boolean valider(int x, int y){
    return (x<0 || x > y  );
    }
}
