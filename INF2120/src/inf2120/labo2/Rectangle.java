/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120;

/**
 *
 * @author janindancause
 */
public class Rectangle extends Forme2D{
    public int hauteur;
    public int largeur;
    
    public Rectangle(){
    }
    public Rectangle(int hauteur,int largeur){
    this.hauteur=hauteur;
    this.largeur=largeur;
    }
    
    public double Aire(){
    return hauteur*largeur;
    }
}
