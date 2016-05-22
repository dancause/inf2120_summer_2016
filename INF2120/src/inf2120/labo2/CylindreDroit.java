/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120.labo2;
import inf2120.main.Forme3D;
import inf2120.main.Iforme;
/**
 *
 * @author janindancause
 */
public class CylindreDroit extends Forme3D implements Iforme {
    int hauteur;
    double rayon;
    
    public CylindreDroit(int hauteur,double rayon){
    this.hauteur=hauteur;
    this.rayon=rayon;
    }
    
    public CylindreDroit(){

    }
    

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Aire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param x
     * @return
     */
  
    public double aire_volume()
    {
        return hauteur*rayon*Math.PI;
    }

    

   
    
}
