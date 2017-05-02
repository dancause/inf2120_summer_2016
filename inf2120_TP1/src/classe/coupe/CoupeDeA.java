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
public class CoupeDeA extends Coupe{
    private int _debut;
    private int _fin;

public CoupeDeA( int a_debut, int a_fin ){
        assert 0 <= a_debut;
        assert a_debut <= a_fin;
        _debut = a_debut;
        _fin = a_fin;
    }

public int debut(){
        return _debut;
    }

public int fin(){
        return _fin;
    }

    @Override
    public List decouper(List tableau) throws IndexHorsPorte {
     if(fin()<=tableau.size()){
        tableau = new ArrayList<>(tableau.subList(debut(),fin()));
        }else{
          throw new  IndexHorsPorte("\nDépassement du tableau : CoupeDeA");
        }
    return tableau;
    }

    @Override
    public int getDebut(){
    
    return debut();
    }

    @Override
    public int getFin(int x){
      
    return fin();
    }


}
