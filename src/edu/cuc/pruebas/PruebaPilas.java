package edu.cuc.pruebas;

import edu.cuc.listas.Dato;
import edu.cuc.listas.Pila;
import java.util.Random;

/**
 *
 * @author jedabero
 */
public class PruebaPilas {

    public static void main(String args[]) {
        int size = 15000;
        Pila pila = new Pila(size);
        Pila pila2 = new Pila(size);
        Pila pila3 = new Pila(size);
        Random rand = new Random();
        int i = 0;
        do {
            if(pila.insertar(rand.nextInt(size*10))){
                pila2.insertar(rand.nextInt(size*10));
                pila3.insertar(rand.nextInt(size*10));
                i++;
            }
        } while (i<pila.maximoPila());
        //System.out.println(pila);
        
        //System.out.println(pila.buscarPosicion(13));
        
        //System.out.println(pila.quitar(new Dato(10, -1)));
        
        //System.out.println(pila);
        
        pila.bubbleSort();
        pila2.bubbleSortOptimized();
        pila3.quickSort(0,pila3.cima(), true);
        
    }
}
