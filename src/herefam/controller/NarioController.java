/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herefam.controller;

import arbol.nario.listageneralizada.ArbolNarioListaGeneralizada;
import herefam.model.persona.Persona;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author hp
 */
public class NarioController {
    private static final ArbolNarioListaGeneralizada TREE = new ArbolNarioListaGeneralizada();
    private static final String FILE_NAME = "muestras.txt";
    
    public static void load() {
        try {
            init();
            System.out.println("[INFO] arbol n-ario cargado.");
            System.out.println("[INFO] file: " + FILE_NAME);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void init() throws FileNotFoundException, IOException {
        RandomAccessFile file = new RandomAccessFile(FILE_NAME, "rw");
        long len = file.length();
        String data[];

        while(file.getFilePointer() < len) {
            data = file.readLine().split(";");
            TREE.add(new Persona(
                Integer.parseInt(data[0].trim()),
                Integer.parseInt(data[data.length - 1].trim())
            ));
        }
        
        try {
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static int getGradoParentesco(int idA, int idB) {
        int grado = TREE.getGradoParentesco(idA, idB);
        System.out.println("[INFO] grado: " + grado);
        return grado;
    }
    
    public static String mostrarByLevelToInterface(int id, int lvl) {
        String lvls = TREE.mostrarByLevelToInterface(id, lvl);
        System.out.println("[INFO] niveles: " + lvls);
        return lvls;
    }
    
}
