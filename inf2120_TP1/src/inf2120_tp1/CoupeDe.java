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
public class CoupeDe {
    
    private int _debut;
    
    public CoupeDe( int a_debut ){
        assert 0 <= a_debut;
        _debut = a_debut;
        }
    
    public int debut(){
        return _debut;
        }
    
}
