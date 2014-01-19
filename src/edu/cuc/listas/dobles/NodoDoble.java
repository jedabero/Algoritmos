package edu.cuc.listas.dobles;

/**
 *
 * @author jedabero
 * @param <T>
 */
public class NodoDoble<T> {
    
    private T object;
    private NodoDoble ant;
    private NodoDoble sig;

    public NodoDoble() {
    }

    public NodoDoble(T object) {
        this.object = object;
    }

    public boolean esAntNull(){
        return ant == null;
    }
    
    public boolean esSigNull(){
        return sig == null;
    }
    
    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "NodoDoble{" + "object=" + object + '}';
    }
    
}
