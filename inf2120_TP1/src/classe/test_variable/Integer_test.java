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
public class Integer_test {

    public static void test_int() throws IndexHorsPorte {
        System.out.print("\ntest_integer\n");
        Coupe[] A = new Coupe[3];
        A[0] = new CoupeA(3);
        A[1] = new CoupeDe(2);
        A[2] = new CoupeDeA(1, 3);

        System.out.print("\ntest equals :" + A[2].equals(A));
        Integer[] tab = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10};
        Integer[] tab3 = null;
        TableauPartiel<Integer> tab4 = new TableauPartiel<>(tab3);
        TableauPartiel<Integer> tab2 = new TableauPartiel<>(tab);
        TableauPartiel<Integer> tab5 = new TableauPartiel<>(tab2);
        TableauPartiel<Integer> tab7 = null;
        TableauPartiel<Integer> tab8 = new TableauPartiel(tab2.elements());;
        tab7 = new TableauPartiel(tab2.elements());
        System.out.print("\ntab7\n" + tab7.ToString());
        tab5 = tab2;

        try {
            System.out.print("\ntaille 1 : " + tab2.taille() + "\n....");
            System.out.print("\ncontient 2 : " + tab2.contient(1) + "\n....");
            System.out.print("\nPosition 3 : " + tab2.position(7) + "\n....");
            System.out.print("\nget 4 : " + tab2.get(3) + "\n....");
            System.out.print("\nest vide 5 : " + tab2.estVide() + "\n....");
            System.out.print("\nest vide 6 : " + tab4.estVide() + "\n....");

            tab2.remplacer(9, 17);
            tab2.set(0, 999);

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
