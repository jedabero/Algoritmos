
package edu.cuc.arboles;

/**
 *
 * @author Jedabero
 * @param <E>
 */
public interface Arbol<E> {
    
    public boolean estaVacio();
    
    public void vaciar();
    
    public void recorrerPostOrden(NodoBinario<E> raiz);
    public void recorrerPreOrden(NodoBinario<E> raiz);
    public void recorrerEnOrden(NodoBinario<E> raiz);
    
    public boolean buscar(E elemento);
    
}
