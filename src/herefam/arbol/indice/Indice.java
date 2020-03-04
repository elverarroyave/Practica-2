/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herefam.arbol.indice;

import arbol.binario.listadligada.busqueda.avl.ArbolAVL;
import herefam.model.muestra.Muestra;

/**
 *
 * @author hp
 */
public class Indice extends ArbolAVL {
    
    public Muestra add(Comparable muestra) {
        return (Muestra) super.insertarDato(muestra)
            .getDato();
    }
    
    public Muestra getMuestraById(int id) {
        return (Muestra) super.buscar(new Muestra(id))
            .getDato();
    }
    
}
