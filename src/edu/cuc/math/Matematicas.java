package edu.cuc.math;

import static edu.cuc.math.Conteos.*;
import java.math.BigDecimal;

/**
 *
 * @author Jedabero
 */
public final class Matematicas {

    //Metodos
    public static boolean buscar(int v[], int n) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static int buscarPrimerPar(int v[]) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static String convertirABinario(int n) {
        String conv = "";
        if (n < 2) {
            conv = n + conv;
            return conv;
        } else {
            while (n >= 2) {
                int r = n % 2;
                conv = r + conv;
                n /= 2;
            }
            return "1" + conv;
        }
    }

    public static int convertirBinarioADecimal(int n) {
        int dig[] = new int[contarDigitos(n)];
        for (int i = dig.length - 1; i >= 0; i--) {
            dig[i] = n % 2;
            n /= 10;
        }

        int sum = 0;
        for (int i = 0; i < dig.length; i++) {
            sum *= 2;
            sum += dig[i];
        }
        return sum;
    }

    public static int convertirBinarioADecimal(long n) {
        long dig[] = new long[contarDigitos(n)];
        for (int i = 0; i < dig.length; i++) {
            dig[i] = n % 2;
            n /= 10;
        }

        int sum = 0;
        for (int i = dig.length - 1; i >= 0; i--) {
            sum *= 2;
            sum += dig[i];
        }
        return sum;
    }

    public static double convertirBinarioADecimal(double n) {
        double dig[] = new double[contarDigitos(n)];
        for (int i = 0; i < dig.length; i++) {
            dig[i] = n % 2;
            n /= 10;
        }

        double sum = 0;
        for (int i = dig.length - 1; i >= 0; i--) {
            sum *= 2;
            sum += dig[i];
        }
        return sum;
    }

    public static boolean esDivisor(int n, int d) {
        return (n % d == 0);
    }

    public static boolean esPar(int n) {
        return (n % 2 == 0);
    }

    public static boolean esPerfecto(int n) {
        return (sumarDivisores(n) == n);
    }

    public static boolean esPerfecto(long n) {
        return (sumarDivisores(n) == n);
    }

    public static boolean esPrimo(int n) {
        int numDiv = contarDivisores(n);
        return (numDiv == 2);
    }

    public static int factorialCiclo(int n) throws Exception {
        int p = 1;
        if (n < 0) {
            throw new Exception("No hay factorial para enteros negativos");
        } else if (n > 12) {
            throw new Exception("Factorial muy grande para tipo int");
        } else {
            for (int i = 1; i <= n; i++) {
                p *= i;
            }
        }
        return p;
    }

    public static long longFactorialCiclo(int n) throws Exception {
        long p = 1;
        if (n < 0) {
            throw new Exception("No hay factorial para enteros negativos");
        } else if (n > 20) {
            throw new Exception("Factorial muy grande para tipo long");
        } else {
            for (int i = 1; i <= n; i++) {
                p *= i;
            }
        }
        return p;
    }

    public static double doubleFactorialCiclo(int n) throws Exception {
        double p = 1;
        if (n < 0) {
            throw new Exception("No hay factorial para enteros negativos");
        } else if (n > 170) {
            throw new Exception("Factorial muy grande para tipo double");
        } else {
            for (int i = 1; i <= n; i++) {
                p *= i;
            }
        }
        return p;
    }

    public static BigDecimal BigFactorialCiclo(int n) throws Exception {
        BigDecimal p = BigDecimal.ONE;
        if (n < 0) {
            throw new Exception("No hay factorial para enteros negativos");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println(p.precision());
                System.out.println(i);
                p = p.multiply(BigDecimal.valueOf(i));
            }
        }
        return p;
    }

    public static int factorialRecursivo(int n) throws Exception {
        if (n < 0) {
            throw new Exception("No hay factorial para enteros negativos");
        } else if (n == 0) {
            return 1;
        } else if (n > 12) {
            throw new Exception("Factorial muy grande para tipo int");
        } else {
            return factorialRecursivo(n - 1) * n;
        }
    }

    public static long LongFactorialRecursivo(int n) throws Exception {
        if (n < 0) {
            throw new Exception("No hay factorial para enteros negativos");
        } else if (n == 0) {
            return 1;
        } else if (n > 20) {
            throw new Exception("Factorial muy grande para tipo int");
        } else {
            return LongFactorialRecursivo(n - 1) * n;
        }
    }

    public static int mayor(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static int mayor(int v[]) {
        int max = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        return max;
    }

    public static int menor(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static int menor(int v[]) {
        int min = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
            }
        }
        return min;
    }

    public static int mcd(int a, int b) {
        int r0 = a;
        int r1 = b;
        while (r1 != 0) {
            r1 = r0 % r1;
            return mcd(b, r1);
        }
        return r0;
    }

    public static long mcd(long a, long b) {
        long r0 = a;
        long r1 = b;
        while (r1 != 0) {
            r1 = r0 % r1;
            return mcd(b, r1);
        }
        return r0;
    }

    public static double mcd(double a, double b) {
        double r0 = a;
        double r1 = b;
        while (r1 != 0) {
            r1 = r0 % r1;
            return mcd(b, r1);
        }
        return r0;
    }

    public static BigDecimal mcd(BigDecimal a, BigDecimal b) {
        BigDecimal r0 = a;
        BigDecimal r1 = b;
        while (r1.compareTo(BigDecimal.ZERO) != 0) {
            r1 = r0.remainder(r1);
            return mcd(b, r1);
        }
        return r0;
    }

    public static int medio(int a, int b, int c) {
        //return (a>=b)?((b<c)?((a>=c)?c:a)):b:((a<c)?((b>=c)?c:b):a);
        if (a >= b) {
            if (b < c) {
                if (a >= c) {
                    return c;
                } else {
                    return a;
                }
            } else {
                return b;
            }
        } else {
            if (a < c) {
                if (b >= c) {
                    return c;
                } else {
                    return b;
                }
            } else {
                return a;
            }
        }

    }

    public static int potencia(int a, int n) throws ArithmeticException {
        switch (n) {
            case 0:
                return 1;
            case 1:
                return a;
            default:
                if (n < 0) {
                    throw new ArithmeticException("Expoente negativo: " + n);
                } else if (n % 2 == 0) {
                    return potencia(a * a, n / 2);
                } else if (n % 2 == 1) {
                    return potencia(a * a, (n - 1) / 2);
                }
        }
        return 0;
    }

    public static double potencia(double a, int n) {
        switch (n) {
            case 0:
                return 1;
            case 1:
                return a;
            default:
                if (n < 0) {
                    throw new ArithmeticException("Expoente negativo: " + n);
                } else if (n % 2 == 0) {
                    return potencia(a * a, n / 2);
                } else if (n % 2 == 1) {
                    return potencia(a * a, (n - 1) / 2);
                }
        }
        return 0;
    }

    public static BigDecimal potencia(BigDecimal a, int n) {
        switch (n) {
            case 0:
                return BigDecimal.ONE;
            case 1:
                return a;
            default:
                if (n < 0) {
                    throw new ArithmeticException("Expoente negativo: " + n);
                } else if (n % 2 == 0) {
                    return potencia(a.multiply(a), n / 2);
                } else if (n % 2 == 1) {
                    return potencia(a.multiply(a), (n - 1) / 2);
                }
        }
        return BigDecimal.ZERO;
    }

    public static double promedio(int v[]) {
        return (sumarElementos(v) / (double) v.length);
    }

    public static int signo(int n) {
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int siguientePrimo(int n) {
        int sgte = n + 1;
        while (!esPrimo(sgte)) {
            sgte++;
        }
        return sgte;
    }

    public static long siguientePerfecto(int n) {
        long sgte = n + 1;
        while (!esPerfecto(sgte)) {
            sgte++;
        }
        return sgte;
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int[] sumar(int[] a, int[] b) throws Exception {
        if (a.length == b.length) {
            int r[] = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                r[i] = a[i] + b[i];
            }
            return r;
        } else {
            throw new Exception("Vectores  de diferente tamaño.");
        }
    }

    public static Fraccionario sumar(Fraccionario a, Fraccionario b) throws Exception {
        return a.sumar(b);
    }

    public static Polinomio2 sumar(Polinomio2 p1, Polinomio2 p2) throws Exception {
        return Polinomio2.sumar(p1, p2);
    }

    public static int sumarDivisores(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static long sumarDivisores(long n) {
        long sum = 0;
        for (long i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumarElementos(int v[]) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }

    public static int sumarElementosMQ(int v[]) {
        int sum = 0;
        int i = 0;
        while (i < v.length) {
            sum += v[i];
            i++;
        }
        return sum;
    }

    public static int sumarElementosHMQ(int v[]) {
        int sum = 0;
        int i = 0;
        do {
            sum += v[i];
            i++;
        } while (i < v.length);
        return sum;
    }

    public static int sumarElementosHH(int v[]) {
        int sum = 0;
        int i = 0;
        do {
            sum += v[i];
            i++;
        } while (!(i >= v.length));
        return sum;
    }
}
