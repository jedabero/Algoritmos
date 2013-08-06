package edu.cuc.math;

import static edu.cuc.math.Matematicas.*;

/**
 *
 * @author Jedabero
 */
public final class Conteos {

    public static int contarDigitos(int n) {
        int cont = 1;
        while (n >= 10) {
            n = n / 10;
            cont++;
        }
        return cont;
    }

    public static int contarDigitos(long n) {
        int cont = 1;
        while (n >= 10) {
            n = n / 10;
            cont++;
        }
        return cont;
    }

    public static int contarDigitos(double n) {
        int cont = 1;
        while (n >= 10) {
            n = n / 10;
            cont++;
        }
        return cont;
    }

    public static int contarDivisores(int n) {
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static int contarEnIntervalo(int v[], int a, int b) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if ((a < v[i]) && (v[i] < b)) {
                cont++;
            }
        }
        return cont;
    }

    public static int contarPares(int n) {
        int cont = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static int contarPares(int v[]) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static int contarPrimos(int v[]) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (esPrimo(v[i])) {
                cont++;
            }
        }
        return cont;
    }
}
