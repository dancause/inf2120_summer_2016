/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120;
import java.lang.Math;

/**
 *
 * @author janindancause
 */
public class Cercle extends Forme2D {
    
    public double rayon;
    
    public Cercle(){
    }
    public Cercle(double rayon){
    this.rayon=rayon;
    }
   
    public double Aire(){
    return Math.sqrt(rayon)*Math.PI;
    }

    
}
