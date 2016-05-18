package inf2120;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janindancause
 */
public class Couleur {
    private int bleu;
    private int rouge;
    private int vert;
    
    public Couleur(){
    
    }
    public Couleur(int bleu, int rouge, int vert){
    this.bleu=bleu;
    this.rouge=vert;
    this.vert=vert;
    }
    public void setBleu(int bleu){
    this.bleu=bleu;
    }
    public void setRouge(int rouge){
    this.rouge=rouge;
    }
    public void setVert(int vert){
    this.vert=vert;
    }
    
    public int getBleu(){
    return bleu;
    }
    
     public int getRouge(){
    return rouge;
    }
      public int getVert(){
    return vert;
    }
    public void blanchir(){
        this.rouge = ( rouge + 255 ) / 2;
        this.vert = ( vert + 255 ) / 2;
        this.bleu = ( bleu + 255 ) / 2;
    }
    public String toString(){
    return ("Bleu: "+bleu+", Rouge: "+rouge+" , Vert: "+vert);
    }
    
}
