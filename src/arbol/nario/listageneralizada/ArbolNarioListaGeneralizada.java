/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.nario.listageneralizada;

import arbol.binario.listadligada.busqueda.avl.ArbolAVL;
import arbol.binario.listadligada.busqueda.avl.NodoAVL;
import herefam.model.persona.Persona;
import java.util.Stack;

/**
 *
 * @author Alejandro Escobar
 */
public class ArbolNarioListaGeneralizada {

    NodoNario root;
    private static final ArbolAVL INDICE = new ArbolAVL();
        
    public ArbolNarioListaGeneralizada() {
        root = new NodoNario(new Persona(0,0));
    }
    
    public NodoNario add(Persona persona) {
        INDICE.insertarDato(persona);
        
        NodoNario nuevoNodo = new NodoNario(persona);
        if (root.getLigaDerecha() == null) {
            root.setLigaDerecha(nuevoNodo);
            return nuevoNodo;
        }
        
        NodoNario aux = null;
        NodoAVL temp = INDICE.buscar(
            new Persona(
                persona.getPadreId(),
                0
        ));
        if (temp != null) aux = getPadreOf(persona);
        
        if (aux == null) {
            aux = root;
            NodoNario ant = aux;
            while (aux != null) {
                ant = aux;
                aux = aux.getLigaDerecha();
            }
            ant.setLigaDerecha(nuevoNodo);
        } else {
            if (aux.getLigaAbajo() == null) {
               aux.setLigaAbajo(nuevoNodo);
               aux.setSw(1);
            } else {
                NodoNario act = aux.getLigaAbajo();
                NodoNario ant = aux;
                while (act != null) {
                    ant = act;
                    act = act.getLigaDerecha();
                }
                ant.setLigaDerecha(nuevoNodo);
            }
        }
        reorganize();
        return nuevoNodo;
    }
    
    public void reorganize() {
        NodoNario act = root.getLigaDerecha();
        NodoNario ant = act;
        NodoNario aux = null;
        
        while (act != null) {
            
            NodoAVL temp = INDICE.buscar(
                new Persona(
                    act.getDato().getPadreId(),
                    0
            ));
            if (temp != null)
                aux = getPadreOf(act.getDato());
            else
                aux = null;
            
            if (aux != null) {
                ant.setLigaDerecha(act.getLigaDerecha());
                act.setLigaDerecha(null);
                
                if (aux.getSw() == 0) {    
                    aux.setLigaAbajo(act);
                    aux.setSw(1);
                } else {
                    NodoNario tempAct = aux.getLigaAbajo();
                    NodoNario tempAnt = aux;
                    while (tempAct != null) {
                        tempAnt = tempAct;
                        tempAct = tempAct.getLigaDerecha();
                    }
                    tempAnt.setLigaDerecha(act);
                }
                break;
            }
            ant = act;
            act = act.getLigaDerecha();
        }
    }
    
    int cont = 1;
    public void mostrar() {
        Stack<NodoNario> pila = new Stack(); 
        NodoNario run = null;
        pila.add(root.getLigaDerecha());
        
        while (!pila.isEmpty()) {
            run = pila.pop();
            while(run != null) {
                System.out.println("[" + cont++ + "] " + run.getDato().getId());
                if (run.getSw() == 1) pila.add(run.getLigaAbajo());
                run = run.getLigaDerecha();
            }
        }
    }
    
    public int getGradoParentesco(int idA, int idB) {
        NodoNario a = getPersonById(idA);
        NodoNario b = getPersonById(idB);
        if (a == null || b == null || a.getDato().getId() == b.getDato().getId()) return 0;
       
        a = new NodoNario(
            new Persona(
                a.getDato().getId(),
                a.getDato().getPadreId()
        ));
        b = new NodoNario(
            new Persona(
                b.getDato().getId(),
                b.getDato().getPadreId()
        ));
        
        NodoNario padreOfA = getPadreOf(a.getDato());
        NodoNario colaA = a;
        NodoNario aux = colaA;
        NodoNario run = null;
        if (padreOfA != null) {
            run = new NodoNario(
                new Persona(
                    padreOfA.getDato().getId(),
                    padreOfA.getDato().getPadreId()
            ));
        }
        
        while (run != null) {
            aux.setLigaDerecha(run);
            aux = aux.getLigaDerecha();
            run = getPadreOf(run.getDato());
            
            if (run != null) {
                run = new NodoNario(
                    new Persona(
                        run.getDato().getId(),
                        run.getDato().getPadreId()
                ));
            }
        }
        NodoNario padreOfB = getPadreOf(b.getDato());
        NodoNario colaB = b;
        aux = colaB;
        run = null;
        if (padreOfB != null) {
            run = new NodoNario(
                new Persona(
                    padreOfB.getDato().getId(),
                    padreOfB.getDato().getPadreId()
            ));
        }
        while (run != null) {
            aux.setLigaDerecha(run);
            aux = aux.getLigaDerecha();
            run = getPadreOf(run.getDato());
            
            if (run != null) {
                run = new NodoNario(
                    new Persona(
                        run.getDato().getId(),
                        run.getDato().getPadreId()
                ));
            }
        }
        
        run = colaA;
        boolean equals = false;
        NodoNario runB = colaB;
        while (run != null && !equals) {
            while (runB != null && !equals) {
                if (runB.getDato().getId() == run.getDato().getId()) {
                    runB.setLigaDerecha(null);
                    run.setLigaDerecha(colaB);
                    equals = true;
                }
                runB = runB.getLigaDerecha();
            }
            runB = colaB;
            run = run.getLigaDerecha();
        }
        
        if (colaA.getLigaDerecha() == null) {
            return 0;
        } else if (colaA.getLigaDerecha().getLigaDerecha() == null) {
            return 0;
        }
        
        NodoNario ant = colaA;
        NodoNario sig = colaA.getLigaDerecha().getLigaDerecha();
        
        if (sig == null) return 0;
        while (sig != null ) {
            ant = ant.getLigaDerecha();
            sig = sig.getLigaDerecha();
            if (sig == null) ant.setLigaDerecha(null);
        }
        
        int grado = 0;
        if (equals) {
            while (colaA != null) {
                grado++;
                colaA = colaA.getLigaDerecha();
            }
        }
        return grado;
    }
    
    public void mostrarByLevel(int id, int limit) {
        NodoNario padre = getPersonById(id);
        NodoNario run = padre;
        String cadena = "";
        int lvl = 0;
        
        Stack<NodoNario> pila = new Stack();
        pila.add(run);
        
        System.out.println("Level: [0]");
        while (!pila.isEmpty() && lvl <= limit) {
            run = pila.pop();
            cadena = "";
            lvl++;
            while(run != null && lvl <= limit) {
                if (run.getSw() == 1) pila.add(run.getLigaAbajo());
                cadena += " -> " + run.getDato().getId() + ":[" + run.getDato().getPadreId() + "]";
                if (lvl == 1) break;
                run = run.getLigaDerecha();
            }
            if (lvl <= limit) System.out.println("       [" + lvl + "]" + cadena);
        }
    }
    
    public String mostrarByLevelToInterface(int id, int limit) {
        NodoNario padre = null;       
        if (INDICE.buscar(new Persona(id,0)) != null)
            padre = getPersonById(id);
        else
            return "Registro no encontrado";
        
        NodoNario run = padre;
        StringBuilder union = new StringBuilder();
        String cadena = "";
        int lvl = 0;
        
        Stack<NodoNario> pila = new Stack();
        pila.add(run);
        
        while (!pila.isEmpty() && lvl <= limit) {
            run = pila.pop();
            cadena = "";
            lvl++;
            while(run != null && lvl <= limit) {
                if (run.getSw() == 1) pila.add(run.getLigaAbajo());
                cadena += " -> " + run.getDato().getId() + ":[" + run.getDato().getPadreId() + "]";
                if (lvl == 1) break;
                run = run.getLigaDerecha();
            }
            if (lvl <= limit) union.append("[" + lvl + "]" + cadena + "\n");
        }
        
        return union.toString();
    }
    
    public NodoNario getPadreOf(Persona persona) {
        NodoNario run = root.getLigaDerecha();
        if (run == null) {
            return run;
        }
        
        Stack<NodoNario> pila = new Stack();
        pila.add(run);
        while (!pila.isEmpty()) {
            run = pila.pop();
            while(run != null) {
                if (run.getDato().getId() == persona.getPadreId()) {
                    return run;
                }
                
                if (run.getSw() == 0 || run.getDato().getId() == persona.getId()) {
                    run = run.getLigaDerecha();
                } else {
                    pila.add(run.getLigaAbajo());
                    run = run.getLigaDerecha();
                }
            }
        }   
        return run;
    }
    
    public NodoNario getPersonById(int id) {
        NodoNario run = root.getLigaDerecha();
        if (run == null) return run;
        
        Stack<NodoNario> pila = new Stack();
        pila.add(run);
        while (!pila.isEmpty()) {
            run = pila.pop();
            while(run != null) {
                if (run.getDato().getId() == id) return run;
                if (run.getSw() == 1) pila.add(run.getLigaAbajo());
                run = run.getLigaDerecha();
            }
        }   
        return run;
    }
    
}
