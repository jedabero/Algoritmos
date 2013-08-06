package edu.cuc.listas;

/**
 *
 * @author jedabero
 */
public class Cola {

    private int frente;
    private int tope;
    private int elem;
    private int maxCola;
    private Dato[] listaDatos;

    public Cola(int maxC) {
        frente = 0;
        tope = -1;
        elem = 0;
        maxCola = maxC - 1;
        listaDatos = new Dato[maxCola];
    }

    public int elementos() {
        return elem;
    }

    public int maximoCola() {
        return maxCola;
    }

    public boolean colaLlena() {
        return elementos() == maximoCola();
    }

    public boolean colaVacia() {
        return elementos() == 0;
    }

    public boolean instertar(int v) {
        if (!colaLlena()) {
            if (tope < maxCola) {
                tope++;
            } else {
                tope = 0;
            }
            elem++;
            Dato nd = new Dato(v, tope);
            listaDatos[tope] = nd;
            return true;
        } else {
            return false;
        }
    }

    public Dato quitar() {
        Dato nd = listaDatos[frente];
        if (frente < maxCola) {
            frente++;
        } else {
            frente = 0;
        }
        elem--;
        return nd;
    }

    public void vaciarCola() {
        Dato ap;
        while (!colaVacia()) {
            ap = quitar();
        }
    }
}
