package edu.cuc.listas.simples;

/**
 *
 * @author jedabero
 */
public class Lista<T> {

    private Nodo cab;
    private Nodo fin;

    public Lista() {
    }

    public boolean esVacia() {
        return cab == null;
    }

    public boolean hayUnSoloNodo() {
        return cab.esSigNull();
    }

    public Nodo creaNodo(T object) {
        return new Nodo(object);
    }

    public void agregaCab(T object) {
        agregaCab(creaNodo(object));
    }

    public void agregaCab(Nodo p) {
        if (esVacia()) {
            fin = p;
        } else {
            p.setSig(cab);
        }
        cab = p;
    }

    public void agregaFin(T object) {
        agregaFin(creaNodo(object));
    }

    public void agregaFin(Nodo p) {
        if (esVacia()) {
            cab = p;
        } else {
            fin.setSig(p);
        }
        fin = p;
    }

    public boolean eliminarNodoPrincipio() {
        if (esVacia()) {
            return false;
        } else {
            if (hayUnSoloNodo()) {
                cab = null;
                fin = null;
            } else {
                Nodo q = cab.getSig();
                cab.setSig(null);
                cab = q;
            }
            return true;
        }  
    }

    public boolean eliminarNodoFinal() {
        if (esVacia()) {
            return false;
        } else {
            if (hayUnSoloNodo()) {
                cab = null;
                fin = null;
            } else {
                Nodo r = cab;
                Nodo q = r.getSig();
                while (!q.esSigNull()) {
                    r = q;
                    q = q.getSig();
                }
                fin = null;
                r.setSig(null);
                fin = r;
            }
            return true;
        }
    }

    @Override
    public String toString() {
        return "ListaEnlazada{" + '}';
    }
    
}
