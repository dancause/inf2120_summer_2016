/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe.test_variable;

import classe.TableauPartiel.TableauPartiel;
import classe.coupe.Coupe;
import classe.coupe.CoupeA;
import classe.coupe.CoupeDe;
import classe.coupe.CoupeDeA;
import classe.erreur.ElementNonPresent;
import classe.erreur.IndexHorsPorte;

/**
 *
 * @author janindancause
 */
public class String_test {
    public static void test_string() throws IndexHorsPorte{
        System.out.print("\ntest_String\n");
        Coupe[] A = new Coupe[3];
        A[0] = new CoupeA(3);
        A[1] = new CoupeDe(2);
        A[2] = new CoupeDeA(1, 3);

        System.out.print("\ntest equals :" + A[2].equals(A));
        String[] tab = new String[]{"allo","allo","123","123","abc","ABC","xyz","999"};
        String[] tab3 = null;
        TableauPartiel<String> tab4 = new TableauPartiel<>(tab3);
        TableauPartiel<String> tab2 = new TableauPartiel<>(tab);
        TableauPartiel<String> tab5 = new TableauPartiel<>(tab2);
        TableauPartiel<String> tab7 = null;
        TableauPartiel<String> tab8 = new TableauPartiel(tab2.elements());;
        tab7 = new TableauPartiel(tab2.elements());
        System.out.print("\ntab7\n" + tab7.ToString());
        tab5 = tab2;

        try {
            System.out.print("\ntaille 1 : " + tab2.taille() + "\n....");
            System.out.print("\ncontient 2 : " + tab2.contient("Allo") + "\n....");
            System.out.print("\nPosition 3 : " + tab2.position("allo") + "\n....");
            System.out.print("\nget 4 : " + tab2.get(3) + "\n....");
            System.out.print("\nest vide 5 : " + tab2.estVide() + "\n....");
            System.out.print("\nest vide 6 : " + tab4.estVide() + "\n....");

            tab2.remplacer("abc", "123xyz");
            tab2.set(0,"123abc");

            System.out.print("\ntab2\n" + tab2.ToString());
            System.out.print("\ntab5\n" + tab5.ToString());
            System.out.print("\ntab7\n" + tab7.ToString());

            tab8 = tab2.coupe(A[0]);
            System.out.print("\ncoupe 0...........test fin: " + tab8.ToString());
            tab8 = tab2.coupe(A[1]);
            System.out.print("\ncoupe 1...........test fin: " + tab8.ToString());
            tab8 = tab2.coupe(A[2]);
            System.out.print("\ncoupe 2...........test fin: " + tab8.ToString());

        } catch (ElementNonPresent | IndexHorsPorte | NullPointerException e) {
            System.out.println(e);

        }
    
    
    
    }
    
}
