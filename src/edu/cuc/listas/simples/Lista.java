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
    
    public Nodo<T> buscar() {
        //TODO generic search
        return null;
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
        
        l.agregaCab("Hola");
        l.agregaCab("lol");
        
        System.out.println(l);
    }
    
}
