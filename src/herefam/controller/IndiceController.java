/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herefam.controller;

import herefam.model.muestra.Muestra;
import herefam.arbol.indice.Indice;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.IOException;

/**
 *
 * @author hp
 */
public class IndiceController {
    
    public static final Indice INDICE = new Indice();
    private static final String FILE_NAME = "muestras.txt";
    
    public static void load() {
        try {
            init();
            System.out.println("[INFO] arbol binario cargado.");
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
        long posicion;
        String data;

        while(file.getFilePointer() < len) {
            posicion = file.getFilePointer();
            data = file.readLine().split(";")[0];

            INDICE.add(new Muestra(
                Integer.parseInt(data),
                posicion
            ));
        }

        try {
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void printMuestraById(int id) {
        try {
            String[] data = getLine(id).split(";");
            String line = "[INFO]";
            for (String dato : data) {
                line += " \n ♦ " + dato;  
            }
            System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String printMuestraByIdInterface(int id) {
        try {
            String[] data = getLine(id).split(";");
            String line = "------------------------[INFO]------------------------\n";
                line += "♦ Cedula: " + data[0] + " \n"
                      + "♦ Nombre: " + data[1] + " \n" 
                      + "♦ Gen #1: " + data[2] + " \n"
                      + "♦ Gen #2: " + data[3] + " \n" 
                      + "♦ Gen #3: " + data[4] + " \n" 
                      + "♦ Gen #4: " + data[5] + " \n" 
                      + "♦ Cedula del padre: " + data[6]; 
                
            return line;
        } catch (FileNotFoundException e) {
            return(e.getMessage());
        } catch (IOException e) {
            return(e.getMessage());
        }
    }
    
    public static String getLine(int id) throws FileNotFoundException, IOException {
        RandomAccessFile file = new RandomAccessFile(FILE_NAME, "rw");
        String line;
        
        file.seek(INDICE.getMuestraById(id).getPosicion());
        line = file.readLine();

        try {
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return line;
    }
}
