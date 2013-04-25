
package edu.cuc.math;

import static edu.cuc.math.Matematicas.*;
import java.math.BigDecimal;

/**
 *
 * @author Jedabero
 */
public final class Series {
    
    public static double sin(double x) throws Exception{
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            int one = potencia(-1, i);
            long fac = factorialCiclo(2*i + 1);
            double x2n = potencia(x, 2*i + 1);
            sum += (one*x2n/fac);
        }
        return sum;
    }
    
    public static double sin(double x, int presicion) throws Exception{
        double sum = 0;
        for (int i = 0; i < presicion; i++) {
            int one = potencia(-1, i);
            long fac = factorialCiclo(2*i + 1);
            double x2n = potencia(x, 2*i + 1);
            sum += (one*x2n/fac);
        }
        return sum;
    }
    
    public static BigDecimal sin(BigDecimal x, int presicion){
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < presicion; i++) {
            //pow(-1, i)
            BigDecimal minusOne = BigDecimal.ONE.pow(i);
            //factorial(2*i+1)
            
            //pow(x, 2*i+1)
            //sum = sum.add()
        }
        return sum;
    }
    
    public static double cos(double x) throws Exception{
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            int one = potencia(-1, i);
            long fac = factorialCiclo(2*i);
            double x2n = potencia(x, 2*i);
            sum += (one*x2n/fac);
        }
        return sum;
    }
    
    public static double cos(double x, int presicion) throws Exception{
        double sum = 0;
        for (int i = 0; i < presicion; i++) {
            int one = potencia(-1, i);
            long fac = factorialCiclo(2*i);
            double x2n = potencia(x, 2*i);
            sum += (one*x2n/fac);
        }
        return sum;
    }
    
    public static double exp(double x) throws Exception{
        double sum = 0;
        for (int i = 0; i < 19; i++) {
            sum += potencia(x, i)/factorialCiclo(i);
        }
        return sum;
    }
    
    public static double exp(double x, int presicion) throws Exception{
        double sum = 0;
        for (int i = 0; i < presicion; i++) {
            sum += potencia(x, i)/factorialCiclo(i);
        }
        return sum;
    }
    
}
