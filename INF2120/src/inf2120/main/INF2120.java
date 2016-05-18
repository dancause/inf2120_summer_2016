/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120;

/**
 *
 * @author janindancause
 */
public class INF2120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Couleur c1 = new Couleur( 1, 4, 6 );
        Couleur c2 = c1;
        System.out.println( c2.toString() );
        c2.setRouge( 100 );
        System.out.println( c1.toString()  );
        System.out.println( c2.toString()  );
        c1.blanchir();
    System.out.println( c1.toString() );
    System.out.println( c2.toString() );
    Bien [] liste=new Bien[3];
    liste[0]=new Livre(10);
    liste[1]=new Meuble(10);
    liste[2]=new Legume(10);
    
    System.out.println(montant(liste)+"$");
    
    
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
    
}
