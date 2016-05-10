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
public class Bien {
protected double  prixEtalage; 
{
prixEtalage=0.0;
}

public Bien(double prixEtalage){
this.prixEtalage=prixEtalage;
}
public Bien(){
}

public double prix(){
return prixEtalage;
}
}
