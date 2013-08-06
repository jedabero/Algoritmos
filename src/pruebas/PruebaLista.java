package pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;
import edu.cuc.listas.ListaPalabras;

/**
 *
 * @author jberdugo10
 */
public class PruebaLista {

    public static void main(String args[]) {
        ListaPalabras miLista = null;
        ListaPalabras miLista2 = null;
        try {
            miLista = new ListaPalabras(10);
            miLista2 = new ListaPalabras(10);
        } catch (Exception ex) {
            Logger.getLogger(PruebaLista.class.getName()).log(Level.SEVERE, null, ex);
        }

        miLista.adicionarPalabra("Hola");
        miLista.adicionarPalabra("Clase");
        miLista.adicionarPalabra("De");
        miLista.adicionarPalabra("Programación");

        System.out.println("Buscar Hola: " + miLista.buscar("Hola"));
        System.out.println("Buscar Mundo: " + miLista.buscar("mundo"));
        System.out.println("Lista: " + miLista);

        miLista.eliminar("De");
        System.out.println("Lista: " + miLista);

        miLista.eliminar("Mundo");
        System.out.println("Lista: " + miLista);

        System.out.println("Contar la palabra Clase: "
                + miLista.contarPalabras("Clase", 3));

        try {
            System.out.println("Promedio palabras: "
                    + miLista.promedioPalabras());
            System.out.println("Elementos con longitud por encima del promedio: "
                    + miLista.contarElementosPromedio("Clase"));
        } catch (Exception ex) {
            Logger.getLogger(PruebaLista.class.getName()).log(Level.SEVERE, null, ex);
        }



        miLista2.adicionarPalabra("Hola");
        miLista2.adicionarPalabra("Clase");
        miLista2.adicionarPalabra("De");
        miLista2.adicionarPalabra("Calculo");
        miLista2.adicionarPalabra("Vectorial");
        try {
            System.out.println("Palabras comunes entre\n" + miLista + "\ny\n" + miLista2
                    + "\nes:\n" + miLista.palabrasComunes(miLista, miLista2));
        } catch (Exception ex) {
            Logger.getLogger(PruebaLista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
