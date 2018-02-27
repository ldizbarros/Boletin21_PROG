package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Codifica un programa  que:
 * lea unha lista de palabras dende o teclado.
 * Ordene alfabéticamente estas palabras.
 * Escriba o resultado nun ficheiro de texto de xeito que, 
 * cada palabra estea nunha liña e éstas esten numeradas 
**/
public class Boletin21 {

    public static void main(String[] args) {
        Metodos obx1 = new Metodos();
        
        ArrayList <String> lista = obx1.introdicirLista();
        
        ArrayList <String> listaOrdenada = obx1.ordenarLista(lista);
        
        try {
            obx1.guardarLista(listaOrdenada);
        } catch (IOException ex) {
            Logger.getLogger(Boletin21.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
