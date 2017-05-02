/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120_tp2;

/**
 *
 * @author janindancause
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


public class ListeEtiquette< E > extends ArrayList< E > {
public List <E>liste=new ArrayList<>();
private int taille=0;


    public ListeEtiquette() {
    super();
    }
    
   
    public void ajouterEtiquette( Etiquette a_etiquette ){
        
 liste.add((E) a_etiquette);
 setTaille(getTaille()+1);
    }
    public void supprimerEtiquette( Etiquette a_etiquette ){

        if(liste.contains(a_etiquette)){
        liste.remove(a_etiquette);
        setTaille(getTaille()-1);
        }
    }
    
    public void supprimerEtiquettes( String a_id ){
        
        
       // Iterator<E> itString = (Iterator<E>) iterator(a_id);
        //Object temp;
        this.clear();
        
        
       /* while(itString.hasNext()){  
        
            
       
            this.remove(itString.next());
            
            setTaille(getTaille()-1);
        }*/
        
    }
    
    public Iterator< Etiquette > iterator( int a_position ){
      ArrayList <E>temp=new ArrayList<>();
      Etiquette Retour=null;
      Integer debut=0;
      Integer fin=0;
      
       
		Iterator<Etiquette> itEtiquette = (Iterator<Etiquette>) this.liste.iterator();
		while (itEtiquette.hasNext()) {
                    Retour=itEtiquette.next();
                    if(Retour.debut()==a_position||Retour.fin()==a_position){  
                      //debut=Retour.debut();
                      //  fin=Retour.fin();
                      temp.add((E) Retour);
                   // temp.add((E) debut);
                   // temp.add((E)fin);
                                     }         
		}
                
     // temp=trouverDoublon(temp);         
    return (Iterator<Etiquette>) temp.iterator();
    }
    
    public Iterator< E > iterator( String a_id ){
        Integer debut;
        Integer fin;
        Etiquette temp=null;
        Iterator<Etiquette> itEtiquette = (Iterator<Etiquette>) this.liste.iterator();
        Iterator<Etiquette> itTemp=null;
      
        ArrayList <E>li=new ArrayList<>();
    
        while(itEtiquette.hasNext()){
                 temp=itEtiquette.next();
            if(a_id.equalsIgnoreCase(temp.id())){
                debut=temp.debut();
                fin=temp.fin();
                li.add((E) debut );
                 li.add((E) fin); 
            }            
        }
        li=trouverDoublon(li);
        return  li.iterator();
    }
   
    private int getTaille() {
        return taille;
    }
    private void setTaille(int x){
    taille=x;
    }

    @Override
    public String toString() {
       String temp="";
       Etiquette xtemp;
       for(int i =0; i<getTaille();++i){
           
           if(liste.get(i) instanceof Etiquette){   
           xtemp= (Etiquette) liste.get(i);
           System.out.print (" "+xtemp.id()+" "+xtemp.debut()+"-"+xtemp.fin());
           }
}
   return temp;
    } 

    
    
    private ArrayList<E> trouverDoublon(ArrayList<E> list) {

	// Store unique items in result.
	ArrayList<E> result = new ArrayList<>();

	// Record encountered Strings in HashSet.
	HashSet<E> set = new HashSet<>();

	// Loop over argument list.
	for (E item : list) {

	    // If String is not in set, add it to the list and the set.
	    if (!set.contains(item)) {
		result.add(item);
		set.add(item);
	    }
	}
	return result;
    }
    
    
    }
    
