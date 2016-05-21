/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120_tp1;

/**
 *
 * @author janindancause
 */
public class CoupeA extends Coupe{
 private int _fin;
 
public CoupeA( int a_fin ){
    assert 0 <= a_fin;
    _fin = a_fin;
    }

public int fin(){
    return _fin;
    } 

}
