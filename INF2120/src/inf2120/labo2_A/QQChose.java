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
public class QQChose<T> extends PeutEtre <T> {
private T valeur;
public QQChose(T valeur ){
this.valeur=valeur;
}
    @Override
    public boolean estQQChose() {
    return true;
    }

    @Override
    public boolean estRien() {
    return false;
    }

    @Override
    public T qQChose() throws ARien {
    return valeur;
    }
    
}
