/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120.labo2;

import inf2120.main.Forme3D;

/**
 *
 * @author janindancause
 */
public class Sphere extends Forme3D {
    double rayon;
    public Sphere(int rayon){
        this.rayon=rayon;
    }
    @Override
    public double volume(){
    return ( 4 * Math.PI * Math.cbrt(rayon))/3;
    }

    @Override
    public double Aire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

  
  
}
