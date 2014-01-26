package edu.cuc.listas.simples;

/**
 *
 * @author jedabero
 * @param <T>
 */
public class ListaCircular<T> {
    
    private Nodo cab;
    private Nodo fin;
    
    public ListaCircular() {
    }

    public boolean esVacia() {
        return cab == null;
    }
    
    public boolean hayUnSoloNodo() {
        return cab.getSig() == cab;
    }
    
    public Nodo crearNodo(T object) {
        Nodo x = new Nodo(object);
        return x;
    }
    
    public void agregarFinal(Nodo p) {
        if (esVacia()) {
            p.setSig(p);
            cab = p;
        } else {
            fin.setSig(p);
            p.setSig(cab);
        }
        fin = p;
    }
    
    public void agregarFinal(T object) {
        agregarFinal(crearNodo(object));
    }
    
    public void agregarCabecera(Nodo p) {
        if(esVacia()) {
            p.setSig(p);
            fin = p;
        } else {
            fin.setSig(p);
            p.setSig(cab);
        }
        cab = p;
    }
    
    //TODO
    
}
