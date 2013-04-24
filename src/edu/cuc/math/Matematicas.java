
package edu.cuc.math;

/**
 *
 * @author Jedabero
 */
public class Matematicas {
    
    //Metodos
    
    public static boolean buscar(int v[], int n){
        for (int i = 0; i < v.length; i++) {
            if (v[i]==n) {
                return true;
            }
        }
        return false;
    }
    
    public static int buscarPrimerPar(int v[]){
        for (int i = 0; i < v.length; i++) {
            if (v[i]%2 == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static int contarDigitos(int n){
        int cont = 1;
        while (n>=10) {            
            n = n/10;
            cont++;
        }
        return cont;
    }
    
    public static int contarDivisores(int n){
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                cont++;
            }
        }
        return cont;
    }
    
    public static int contarEnIntervalo(int v[], int a, int b) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if ((a < v[i])&&(v[i] < b)) {
                cont++;
            }
        }
        return cont;
    }
    
    public static int contarPares(int v[]){
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i]%2==0) {
                cont++;
            }
        }
        return cont;
    }
    
    public static int contarPrimos(int v[]){
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (esPrimo(v[i])) {
                cont++;
            }
        }
        return cont;
    }
    
    public static String convetirABinario(int n){
        String conv = "";
        if (n<2) {
            conv = n + conv;
            return conv;
        }else{
            while (n>=2) {
                int r = n%2;
                conv = r +conv;
                n /= 2;
            }
            return "1"+conv;
        }
    }
    
    public static boolean esDivisorDe(int n, int d){
        return (n%d==0);
    }
    
    public static boolean esPar(int n){
        return (n%2==0);
    }
    
    public static boolean esPerfecto(int n){
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0) {
                sum += i;
            }
        }
        return (sum == n);
    }
    
    public static boolean esPrimo(int n){
        int numDiv = contarDivisores(n);
        return (numDiv == 2);
    }
    
    public static int factorialCiclo(int n){
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        return p;
    }
    
    public static int factorialRecursivo(int n){
        if (n == 0) {
            return 1;
        } else {
            return factorialRecursivo(n-1)*n;
        }
    }
    
    public static int mayor(int a, int b){
        return (a>=b)? a : b;
    }
    
    public static int medio(int a, int b, int c){
        
        if (a>=b) {
            if (a>=c) {
                if (b>=c) {
                    return b;
                }else{
                    return c;
                }
            } else {
                return a;
            }
        } else {
            if(b>=c){
                if (a>=c) {
                    return a;
                } else {
                    return c;
                }
            }else{
                return b;
            }
        }
        
    }
    
    public static double promedio(int v[]){
        return (sumarElementos(v)/(double)v.length);
    }
    
    public static int signo(int n){
        if (n>0) {
            return 1;
        } else if(n<0){
            return -1;
        }else{
            return 0;
        }
    }
    
    public static int siguientePrimo(int n){
        int sgte = n + 1;
        while (!esPrimo(sgte)) {            
            sgte++;
        }
        return sgte;
    }
    
    public static int sumar(int a, int b){
        return a+b;
    }
    
    public static double sumar(double a, double b){
        return a+b;
    }
    
    public static int[] sumar(int[] a, int[] b) throws Exception{
        if (a.length==b.length) {
            int r[] = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                r[i] = a[i] + b[i];
            }
            return r;
        }else{
            throw new Exception("Vectores  de diferente tamaño.");
        }
    }
    
    public static Fraccionario sumar(Fraccionario a, Fraccionario b) throws Exception{
        return a.sumar(b);
    }
    
    public static Polinomio2 sumar(Polinomio2 p1, Polinomio2 p2) throws Exception{
        return Polinomio2.sumar(p1, p2);
    }
    
    public static int sumarElementos(int v[]){
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }
    
    public static int sumarElementosMQ(int v[]){
        int sum = 0;
        int i = 0;
        while (i < v.length) {
            sum += v[i];
            i++;
        }
        return sum;
    }
    
    public static int sumarElementosHMQ(int v[]){
        int sum = 0;
        int i = 0;
        do {
            sum += v[i];
            i++;
        } while (i < v.length);
        return sum;
    }
    
    public static int sumarElementosHH(int v[]){
        int sum = 0;
        int i = 0;
        do {
            sum += v[i];
            i++;
        } while (!(i >= v.length));
        return sum;
    }
    
    
}
