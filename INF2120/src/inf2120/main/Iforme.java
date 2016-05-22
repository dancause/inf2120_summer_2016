package inf2120.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janindancause
 */
public interface Iforme {
     double aire_volume();
     
     default double aire2(int x){
     return x*4;
     }
    
}
