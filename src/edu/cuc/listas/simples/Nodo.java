package edu.cuc.listas.simples;

/**
 *
 * @author jedabero
 */
public class Nodo<T> {

    private T object;
    private Nodo sig;

    public Nodo() {
    }

    public Nodo(T object) {
        this.object = object;
    }
    
    public boolean esSigNull() {
        return sig == null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "Nodo{" + "object=" + object + '}';
    }
}
