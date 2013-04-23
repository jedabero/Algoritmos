
package edu.cuc.math;

/**
 *
 * @author Jedabero
 */
public class Matematicas {
    
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
    
    public static boolean esPar(int n){
        return (n%2==0);
    }
    
    public static boolean esDivisorDe(int n, int d){
        return (n%d==0);
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
    
}