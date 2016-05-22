/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120.labo2_A;

/**
 *
 * @author janindancause
 */
public class Rien <T> extends PeutEtre <T>{
    public Rien(){}
    public boolean estQQChose(){
    return false;
    }

    @Override
    public boolean estRien() {
    return true;
    }

    @Override
    public T qQChose() throws ARien {
    throw new ARien(); 
    }
}