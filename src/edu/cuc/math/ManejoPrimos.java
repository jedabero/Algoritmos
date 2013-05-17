
package edu.cuc.math;

/**
 *
 * @author jberdugo10
 */
public class ManejoPrimos {
    
    public static int contarDivisores(int numero){
        int cont = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero%i==0) {
                cont++;
            }
        }
        return cont;
    }
    
    public static boolean esPrimo(int numero){
        return (contarDivisores(numero)==2);
    }
    
    public static int contarPrimosRango(int numInicial, int numFinal){
        int cont = 0;
        for (int i = numInicial; i <= numFinal; i++) {
            if(esPrimo(i)){
                cont++;
            }
        }
        return cont;
    }
    
    public static int[] listaPrimos(int cantPrimos){
        int lista[] = new int[cantPrimos];
        int cont = 0;
        int numActual = 2;
        
        while (cont<cantPrimos) {
            if(esPrimo(numActual)){
                lista[cont] = numActual;
                cont++;
            }
            numActual++;
        }
        return lista;
    }
    
    public static int[] listaPrimos2(int cantPrimos){
        int[] lista = new int[cantPrimos];
        lista[0] = 2;
        for (int i = 0; i < cantPrimos; i++) {
            lista[i] = siguientePrimo(lista[i-1]);
        }
        return lista;
    }
    
    public static int siguientePrimo(int numero){
        int siguiente = numero + 1;
        while (!esPrimo(siguiente)) {
            siguiente++;
        }
        return siguiente;
    }
    
    public static int cantidadPrimosVector(int v[]){
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if(esPrimo(v[i])){
                cont++;
            }
        }
        return cont;
    }
    
    public static void main(String[] args) {
        
        System.out.println(contarDivisores(6));
        System.out.println(contarDivisores(7));
        
        System.out.println(esPrimo(6));
        System.out.println(esPrimo(7));
        
        System.out.println(contarPrimosRango(1, 42));
        
        int lista[] = listaPrimos(10);
        for (int i = 0; i < lista.length; i++) {
            System.out.println(i+":"+lista[i]);
        }
        
        System.out.println(siguientePrimo(6));
        System.out.println(siguientePrimo(47));
        
        System.out.println(cantidadPrimosVector(lista));
        int l[] = {1,2,5,8,449,1112,1109};
        System.out.println(cantidadPrimosVector(l));
    }
    
}
