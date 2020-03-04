/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herefam.model.muestra;

/**
 *
 * @author hp
 */
public class Muestra implements Comparable<Muestra> {
    private int cedula;
    private long posicion;
    
    public Muestra() {
        
    }
    
    public Muestra(int cedula) {
        this.cedula = cedula;
    }
    
    public Muestra(int cedula, long posicion) {
        this.cedula = cedula;
        this.posicion = posicion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public long getPosicion() {
        return posicion;
    }

    public void setPosicion(long posicion) {
        this.posicion = posicion;
    }
    
    @Override
    public String toString() {
        return "-> " + cedula;
    }

    @Override
    public int compareTo(Muestra muestra) {
        return cedula > muestra.getCedula()
            ? 1
            : cedula < muestra.getCedula()
                ? -1
                : 0;
    }
    
}
