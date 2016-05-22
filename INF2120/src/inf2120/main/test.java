/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120.main;

/**
 *
 * @author janindancause
 */
public class test extends Forme2D implements Iforme {
    int x;
    int y;

    @Override
    public double aire_volume() {
        return x*y;
    }

    @Override
    public double Aire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
