/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120_tp1;

/**
 *
 * @author janindancause
 */
public class TableauPartiel <E>{
    
public TableauPartiel( E[] a_tableau )
{

}
public TableauPartiel( TableauPartiel<E> a_tableauPartiel )
{

}
public int position( E a_element ) throws ElementNonPresent{ 
    return 1;
}

public boolean contient( E a_element ){
    return false;
}

public TableauPartiel<E> coupe( Coupe a_coupe )throws IndexHorsPorte {
    return null;
}

public E[] elements(){ 
    return null;
}

public boolean estVide(){
    return false;
}

public E get( int a_position ) throws IndexHorsPorte {
    return null;
}

public void remplacer( E a_ancien, E a_nouveau ) throws ElementNonPresent {

}

public void set( int a_position, E a_element ) throws IndexHorsPorte{

}

public int taille(){
    
    return 1;} 
}
