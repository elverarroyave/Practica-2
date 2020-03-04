/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herefam.model.persona;

/**
 *
 * @author hp
 */
public class Persona implements Comparable<Persona> {
    private int id;
    private int padreId;
    
    public Persona(int id, int padreId) {
        this.id = id;
        this.padreId = padreId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPadreId() {
        return padreId;
    }

    public void setPadreId(int padreId) {
        this.padreId = padreId;
    }
    
    @Override
    public int compareTo(Persona persona) {
        return id > persona.getId()
            ? 1
            : id < persona.getId()
                ? -1
                : 0;
    }
    
}
