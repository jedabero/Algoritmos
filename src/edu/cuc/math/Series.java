
package edu.cuc.math;

import java.math.BigDecimal;

/**
 *
 * @author Jedabero
 */
public final class Series {
    
    public static double sin(double x) throws Exception{
        return sin(x, 10);
    }
    
    public static double sin(double x, int presicion) throws Exception{
        double sum = 0;
        for (int i = 0; i < presicion; i++) {
            int one = (i%2==0)?1:-1;
            long fac = Matematicas.factorialCiclo(2*i + 1);
            double x2n = Matematicas.potencia(x, 2*i + 1);
            sum += (one*x2n/fac);
        }
        return sum;
    }
    
    public static BigDecimal sin(BigDecimal x, int presicion){
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < presicion; i++) {
            Math.pow(-1, i);
            BigDecimal minusOne = BigDecimal.ONE.pow(i);
            //factorial(2*i+1)
            
            //pow(x, 2*i+1)
            //sum = sum.add()
        }
        return sum;
    }
    
    public static double cos(double x) throws Exception{
        return cos(x, 10);
    }
    
    public static double cos(double x, int presicion) throws Exception{
        double sum = 0;
        for (int i = 0; i < presicion; i++) {
            int one = Matematicas.potencia(-1, i);
            long fac = Matematicas.factorialCiclo(2*i);
            double x2n = Matematicas.potencia(x, 2*i);
            sum += (one*x2n/fac);
        }
        return sum;
    }
    
    public static double exp(double x) throws Exception{
        return exp(x, 10);
    }
    
    public static double exp(double x, int presicion) throws Exception{
        double sum = 0;
        for (int i = 0; i < presicion; i++) {
            sum += Matematicas.potencia(x, i)/Matematicas.factorialCiclo(i);
        }
        return sum;
    }
    
}
