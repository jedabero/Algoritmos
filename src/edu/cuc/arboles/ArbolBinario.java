
package edu.cuc.arboles;

/**
 *
 * @author Jedabero
 * @param <E>
 */
public class ArbolBinario<E> implements Arbol<E>{
    
    private NodoBinario<E> raiz;

    public ArbolBinario(NodoBinario<E> raiz) {
        this.raiz = raiz;
    }

    @Override
    public boolean estaVacio() {
        return null == raiz;
    }

    @Override
    public void vaciar() {
        raiz = null;
    }

    @Override
    public void recorrerPostOrden(NodoBinario<E> raiz) {
        if (!estaVacio()) {
            recorrerPostOrden(raiz.getIzq());
            recorrerPostOrden(raiz.getDer());
            System.out.println(raiz);
        }
    }

    @Override
    public void recorrerPreOrden(NodoBinario<E> raiz) {
        if (!estaVacio()) {
            System.out.println(raiz);
            recorrerPreOrden(raiz.getIzq());
            recorrerPreOrden(raiz.getDer());
        }
    }

    @Override
    public void recorrerEnOrden(NodoBinario<E> raiz) {
        if (!estaVacio()) {
            recorrerEnOrden(raiz.getIzq());
            System.out.println(raiz);
            recorrerEnOrden(raiz.getDer());
        }
    }

    @Override
    public boolean buscar(E elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
