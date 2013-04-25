
package edu.cuc.math;

/**
 *
 * @author Jedabero
 */
public class Fraccionario {
    
    private int numerador;
    private int denominador;
    private double valor;
    
    public Fraccionario(int num, int den) throws Exception{
        if(den!=0){
            numerador = num;
            denominador = den;
            
        }else{
            throw new Exception("Denominador no puede ser 0.");
        }
    }
    
    public String toString(){
        return numerador+"/"+denominador;
    }
    
    public double valor(){
        valor = numerador/denominador;
        return valor;
    }
    
    public boolean esImpropia(){
        return (numerador>denominador);
    }
    
    public boolean esUno(){
        return (numerador==denominador);
    }
    
    public int cuantosPares(){
        int cont = 0;
        if(denominador%2==0){
            cont++;
        }
        if (numerador%2==0) {
            cont++;
        }
        return cont;
    }
    
    public static Fraccionario mayor(Fraccionario f1, Fraccionario f2){
        if(f1.valor()>=f2.valor()){
            return f1;
        }else{
            return f2;
        }
    }
    
    public Fraccionario mayor(Fraccionario otroF){
        if(valor()>=otroF.valor()){
            return this;
        }else{
            return otroF;
        }
    }
    
    public Fraccionario sumar(Fraccionario f) throws Exception{
        int denComun = denominador*f.denominador;
        int num1 = numerador*f.denominador;
        int num2 = f.numerador*denominador;
        int num = num1 + num2;
        Fraccionario r = new Fraccionario(num, denComun);
        return r;
    }
    
    public Fraccionario simplificar() throws Exception{
        int mcd = Matematicas.mcd(numerador, denominador);
        int n = numerador/mcd;
        int d = denominador/mcd;
        Fraccionario f = new Fraccionario(n, d);
        return f;
    }
    
}
