package edu.cuc.listas.dobles;

/**
 *
 * @author jedabero
 * @param <T>
 */
public class ListaDoble<T> {
    
    private NodoDoble cab;
    private NodoDoble fin;

    public ListaDoble() {
    }

    public boolean esVacia() {
        return cab == null;
    }

    public boolean hayUnSoloNodo() {
        return cab.getSig() == cab;
    }

    public NodoDoble creaNodo(T object) {
        return new NodoDoble(object);
    }
    
    public void agregarCabecera(NodoDoble p){
        if(esVacia()) {
            fin = p;
        } else {
            cab.setAnt(p);
            p.setSig(cab);
        }
        cab = p;
    }
    
    public void agregarCabecera(T object){
        agregarCabecera(creaNodo(object));
    }
    
    public void agregarFinal(NodoDoble p) {
        if (esVacia()) {
            cab = p;
        } else {
            fin.setSig(p);
            p.setAnt(fin);
        }
        fin = p;
    }
    
    public void agregarFinal(T object) {
        agregarFinal(creaNodo(object));
    }
    
    public NodoDoble<T> buscar() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public String toString() {
        String res = "ListaDoble:\n";
        NodoDoble x = cab;
        if (esVacia()) {
            res += "Lista Vacía.\n";
        } else {
            while (x != null) {
                res += x + "\n";
                x = x.getSig();
            }
        }
        return res;
    }
    
}
