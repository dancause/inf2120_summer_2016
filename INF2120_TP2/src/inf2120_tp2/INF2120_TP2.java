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
public class INF2120_TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
     Etiquette test1=new Etiquette("test1",0,3);
     Etiquette test2=new Etiquette("test1",4,5);
     Etiquette test3=new Etiquette("test3",6,6);
     Etiquette test4=new Etiquette("test4",7,8);
     Etiquette test5=new Etiquette("test5",2,6);
     Etiquette test6=new Etiquette("test1",1,3);
     Etiquette test7=new Etiquette("test_",1,8);
     
    ListeEtiquette liste=new ListeEtiquette();
    liste.ajouterEtiquette(test1);
    liste.ajouterEtiquette(test2);
    liste.ajouterEtiquette(test3);
    liste.ajouterEtiquette(test4);
    liste.ajouterEtiquette(test5);
    liste.ajouterEtiquette(test6);
    liste.ajouterEtiquette(test7);
   // liste.supprimerEtiquettes(test6.id());

//    System.out.println("taille: "+liste.getTaille());
    System.out.println(liste.toString()+"\n\n");
   
    liste.iterator("test1");
    liste.iterator(6);

   liste.supprimerEtiquettes("test1");
   System.out.println(liste.toString()+"\n\n");
    
    }
    
}
