
package edu.cuc.math;

import static edu.cuc.math.Matematicas.*;

/**
 *
 * @author Jedabero
 */
public final class Series {
    
    public static double sin(double x){
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            int one = potencia(-1, i);
            long i2 = 2*i;
            long fac = factorialCiclo(i2 + 1);
            double x2n = potencia(x, 2*i + 1);
            sum += (one*x2n/fac);
        }
        return sum;
    }
    
    public static double sin(double x, int presicion){
        double sum = 0;
        for (int i = 0; i < presicion; i++) {
            int one = potencia(-1, i);
            long i2 = 2*i;
            long fac = factorialCiclo(i2 + 1);
            double x2n = potencia(x, 2*i + 1);
            sum += (one*x2n/fac);
        }
        return sum;
    }
    
    public static double cos(double x){
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            int one = potencia(-1, i);
            long i2 = 2*i;
            long fac = factorialCiclo(i2);
            double x2n = potencia(x, 2*i);
            sum += (one*x2n/fac);
        }
        return sum;
    }
    
    public static double cos(double x, int presicion){
        double sum = 0;
        for (int i = 0; i < presicion; i++) {
            int one = potencia(-1, i);
            long i2 = 2*i;
            long fac = factorialCiclo(i2);
            double x2n = potencia(x, 2*i);
            sum += (one*x2n/fac);
        }
        return sum;
    }
    
    public static double exp(double x){
        double sum = 0;
        for (int i = 0; i < 19; i++) {
            long I = i;
            sum += potencia(x, i)/factorialCiclo(I);
        }
        return sum;
    }
    
    public static double exp(double x, int presicion){
        double sum = 0;
        for (int i = 0; i < presicion; i++) {
            long I = i;
            sum += potencia(x, i)/factorialCiclo(I);
        }
        return sum;
    }
    
}
