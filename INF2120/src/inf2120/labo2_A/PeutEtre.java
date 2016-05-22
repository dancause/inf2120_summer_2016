/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120.labo2_A;

/**
 *
 * @author janindancause
 * @param <T>
 */
public abstract class PeutEtre <T>{
    public abstract boolean estQQChose();
    public abstract boolean estRien();
    public abstract T qQChose() throws ARien;
}
