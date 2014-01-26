package edu.cuc.arboles;

/**
 *
 * @author Jedabero
 * @param <E>
 */
public class NodoBinario<E> {
    
    private E dato;
    
    private NodoBinario izq;
    private NodoBinario der;

    public NodoBinario() {
    }

    public NodoBinario(E dato) {
        this.dato = dato;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoBinario getIzq() {
        return izq;
    }

    public void setIzq(NodoBinario izq) {
        this.izq = izq;
    }

    public NodoBinario getDer() {
        return der;
    }

    public void setDer(NodoBinario der) {
        this.der = der;
    }

    @Override
    public String toString() {
        return "["+dato.toString()+"]";
    }
    
}
