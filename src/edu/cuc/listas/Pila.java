package edu.cuc.listas;

/**
 *
 * @author jedabero
 */
public class Pila {

    private int tope;
    private int maxPila;
    private Dato[] listaDatos;

    public Pila(int maxP) {
        tope = -1;
        maxPila = maxP - 1;
        listaDatos = new Dato[maxPila];
    }

    public int cima() {
        return tope;
    }

    public int maximoPila() {
        return maxPila;
    }

    public boolean pilaLlena() {
        return cima() == maximoPila();
    }

    public boolean pilaVacia() {
        return cima() == -1;
    }

    public boolean insertar(int v) {
        if (!pilaLlena()) {
            tope++;
            Dato nd = new Dato(v, tope);
            listaDatos[tope] = nd;
            return true;
        } else {
            return false;
        }
    }

    public Dato quitar() {
        Dato nd = listaDatos[tope];
        tope--;
        return nd;
    }

    public void vaciarPila() {
        Dato ap;
        while (!pilaVacia()) {
            ap = quitar();
        }
    }
}
