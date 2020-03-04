/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.nario.listageneralizada;

import herefam.model.persona.Persona;

/**
 *
 * @author hp
 */
public class NodoNario {
    private Persona dato;
    private int sw;
    private NodoNario ligaAbajo, ligaDerecha;
    
    public NodoNario() {
        
    }
    
    public NodoNario(Persona dato) {
        this.dato = dato;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public int getSw() {
        return sw;
    }

    public void setSw(int sw) {
        this.sw = sw;
    }

    public NodoNario getLigaAbajo() {
        return ligaAbajo;
    }

    public void setLigaAbajo(NodoNario ligaAbajo) {
        this.ligaAbajo = ligaAbajo;
    }

    public NodoNario getLigaDerecha() {
        return ligaDerecha;
    }

    public void setLigaDerecha(NodoNario ligaDerecha) {
        this.ligaDerecha = ligaDerecha;
    }
    
}
