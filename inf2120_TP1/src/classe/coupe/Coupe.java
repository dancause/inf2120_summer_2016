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
public abstract class Coupe {
   // public  Coupe(){};
    public abstract List decouper(List x)throws IndexHorsPorte;
    public abstract int getDebut();
    public abstract int getFin(int x);
}
