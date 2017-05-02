/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe.coupe;

import classe.erreur.IndexHorsPorte;
import java.util.List;



/**
 *
 * @author janindancause
 */
public class CoupeA extends Coupe{
 private int _fin;
 
public CoupeA( int a_fin ){
assert 0 <= a_fin;
    _fin = a_fin;
    }

public int fin(){
    return _fin;
    } 


@Override
public List decouper( List tableau )throws IndexHorsPorte{


    if(fin()<0 || fin()>tableau.size()){
        throw new IndexHorsPorte("\nDépassement du tableau : CoupeA");
    } 
    return tableau.subList(0, fin());
}

    /**
     *
     * @return
     */
    @Override
    public int getDebut() {
    return 0;
    }

    /**
     *
     * @param x
     * @return
     */
    @Override
    public int getFin(int x){
    return fin();
    }

}
