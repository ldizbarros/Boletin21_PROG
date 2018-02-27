package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Metodos {
    
    File ficheiro;
    FileWriter escribir;
    
    public ArrayList <String>  introdicirLista(){
        ArrayList <String> listaPalabras = new <String> ArrayList();
        
        JOptionPane.showMessageDialog(null, "Introdude una lista de palabras. "
                + "Pulsa 0 para dejar de introducirlas" );
        String palabra = JOptionPane.showInputDialog("Introduce una palabra");

        while(!palabra.equalsIgnoreCase("0")){
            listaPalabras.add(palabra);
            palabra = JOptionPane.showInputDialog("Introduce una palabra");
        }
        return listaPalabras;
    }
    
    public ArrayList <String> ordenarLista(ArrayList <String> lista){
        Comparator<? super String> c = null;
        lista.sort(c);
        return lista;
    }
    
    public void guardarLista(ArrayList <String> lista) throws IOException{
        try {
            ficheiro = new File("listaPalabras.txt");
            escribir = new FileWriter(ficheiro);
            for(int i=0;i<lista.size();i++){
                escribir.write((i+1+") "+lista.get(i)+"\n"));
            }
                       
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR! "+ex.getMessage());
        }
        finally{
            escribir.close();
        }
    }
}
