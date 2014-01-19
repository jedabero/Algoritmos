package edu.cuc.listas.simples;

/**
 *
 * @author jedabero
 * @param <T>
 * 
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

    public void agregarCabecera(T object) {
        agregarCabecera(creaNodo(object));
    }

    public void agregarCabecera(Nodo p) {
        if (esVacia()) {
            fin = p;
        } else {
            p.setSig(cab);
        }
        cab = p;
    }

    public void agregarFinal(T object) {
        agregarFinal(creaNodo(object));
    }

    public void agregarFinal(Nodo p) {
        if (esVacia()) {
            cab = p;
        } else {
            fin.setSig(p);
        }
        fin = p;
    }

    public boolean eliminarCabecera() {
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

    public boolean eliminarFinal() {
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
    
    public Nodo<T> buscar() {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public String toString() {
        String m = "Lista de "+cab.getObject().getClass().getSimpleName();
        if (esVacia()) {
            return m ;
        } else {
            Nodo x = cab;
            while(x != null) {
                m += "\n\t" + x.getObject().toString();
                x = x.getSig();
            }
            
        }
        
        return m;
    }
    
    public static void main(String[] args) {
        Lista<String> l = new Lista<String>();
        
        l.agregarCabecera("Hola");
        l.agregarCabecera("lol");
        
        System.out.println(l);
    }
    
}
