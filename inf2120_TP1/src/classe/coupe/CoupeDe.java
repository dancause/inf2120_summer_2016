/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe.coupe;

import classe.erreur.IndexHorsPorte;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author janindancause
 */
public class CoupeDe extends Coupe{
    
    private int _debut;
    
    public CoupeDe( int a_debut ){
        assert 0 <= a_debut;
        _debut = a_debut;
        }
    
    public int debut(){
        return _debut;
        }

    @Override
    public List decouper(List tableau) throws IndexHorsPorte {
        if((tableau.size()-debut()<=0 && debut()>tableau.size())||debut()<0){
              throw new  IndexHorsPorte("\nDépassement du tableau : CoupeDe");  
        }
    return tableau.subList(debut(), tableau.size());
    }

    @Override
    public int getDebut(){
    return debut();
    }

    @Override
    public int getFin(int size) {
    return size;
    }

    
}
