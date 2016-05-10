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
public class TaxeDouble extends Bien{
   public TaxeDouble(double prixEtalage){
    super(prixEtalage);
    }  
   
public double prix(){
return prixEtalage+(prixEtalage*0.05)+(prixEtalage* 0.09975);
}
}
