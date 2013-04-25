
package edu.cuc.math;

import static edu.cuc.math.Matematicas.*;

/**
 *
 * @author Jedabero
 */
public final class Series {
    
    public static double cos(double x, int presicion){
        double sum = 0;
        for (int i = 0; i < presicion; i++) {
            int one = potencia(-1, i);
            int fac = factorialCiclo(2*i);
            double x2n = potencia(x, 2*i);
            sum += (one*x2n/fac);
        }
        return sum;
    }
    
    
    
}
