/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120.main;

import inf2120.labo1.Bien;
import inf2120.labo1.Couleur;
import inf2120.labo1.Legume;
import inf2120.labo1.Livre;
import inf2120.labo1.Meuble;
import inf2120.labo2.Cercle;
import inf2120.labo2.CylindreDroit;
import inf2120.labo2.Rectangle;
import inf2120.labo2_A.ARien;
import inf2120.labo2_A.PeutEtre;
import inf2120.labo2_A.QQChose;
import inf2120.labo2_A.Rien;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author janindancause
 */
public class INF2120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
       // Couleur c1 = new Couleur( 1, 4, 6 );
        //Couleur c2 = c1;
        /*System.out.println( c2.toString() );
        c2.setRouge( 100 );
        System.out.println( c1.toString()  );
        System.out.println( c2.toString()  );
        c1.blanchir();
    System.out.println( c1.toString() );
    System.out.println( c2.toString() );*/
    Bien [] liste=new Bien[3];
    liste[0]=new Livre(10);
    liste[1]=new Meuble(10);
    liste[2]=new Legume(10);
    
    System.out.println(montant(liste)+"$");
    
    Livre bouquin = new Livre(10);
    Legume carrote = new Legume(10);
    
    if(bouquin instanceof Livre ){
    System.out.print("\ncomparable");
    }else{
    System.out.print("\nnon comparable");
    }
    
    test a = new test();
    Forme2D [] b = new Forme2D[3];
    b[0]= new Rectangle(34,4);
    b[1]=new Cercle(2.3);
    b[2]=new CylindreDroit();
    
    System.out.println("\naire_vol "+a.aire_volume());
    System.out.println("aire2 "+a.aire2(3));
    
    
    }
    
    
    public static double montant(Bien []liste){
        double resultat;
        {
        resultat=0;
        }
        
        for(int i=0; i < liste.length;++i){
        resultat=resultat+liste[i].prix();
        }
        
    return resultat;
    }
    public static <T>PeutEtre<Integer> TrouverElement(T[]tableau,T element){
        List <T> liste=Arrays.asList(tableau);
       // return  liste.contains(element) ? return QQChose
        
    int index=-1;
    for(int i=0 ; i<tableau.length;++i){
    if(tableau[i].equals(element))
        index=i;
        break;
        }
    if(index !=1){
        return new QQChose<>(index);
    
    }else{
        return new Rien();
    }
    }
}
