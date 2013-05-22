
package edu.cuc.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Jedabero
 */
public class Numero implements Cloneable{
    
    private String numero = "";
    private BigDecimal valor;
    private BigDecimal numerador;
    private BigDecimal denominador;
    
    private boolean enDecimal = false;
    
    /**
     *  
     * @param value
     */
    public Numero(BigDecimal numero){
        this(numero, false);
    }
    
    public Numero(BigDecimal numero, boolean enDecimal){
        //Inicializando variables
        this.valor = numero;
        this.enDecimal = enDecimal;
        //Obteniendo parte entera y decimal numero
        BigDecimal[] num = numero.divideAndRemainder(BigDecimal.ONE);
        boolean intZero = num[0].compareTo(BigDecimal.ZERO) == 0;
        BigDecimal integer = (intZero)?BigDecimal.ZERO:num[0].stripTrailingZeros();
        BigDecimal tempNum = num[1];
        //Multiplicando la parte decimal por 10 hasta que sea entera
        int i = 0;
        while(tempNum.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) != 0)
        {
            tempNum = tempNum.multiply(BigDecimal.TEN).stripTrailingZeros();
            i++;
        }
        //Denominador resultante del proceso anterior
        BigDecimal tempDen = BigDecimal.TEN.pow(i);
        //Maximo común divisor
        BigDecimal mcd = Matematicas.mcd(tempNum, tempDen);
        //Se simplifica la fracción
        tempNum = tempNum.divide(mcd);
        denominador = tempDen.divide(mcd);
        //Se suma la parte entera del numero
        numerador = integer.multiply(denominador).add(tempNum);
        
        init();
    }
    
    private void init(){
        valor = numerador.divide(denominador, 9, RoundingMode.HALF_UP).stripTrailingZeros();
        numero =""+((enDecimal)? valor.toPlainString() : numerador+"/"+denominador);
    }
    
    public Numero toDecimal(){
        Numero n = copia();
        if(!enDecimal){
            n.enDecimal = true;
            n.init();
        }
        return n;
    }
    
    public Numero toFracionario(){
        Numero n = copia();
        if(enDecimal){
            n.enDecimal = false;
            n.init();
        }
        return n;
    }
    
    public Numero sumar(Numero sumando){
        Numero n = copia();
        BigDecimal denComun = n.denominador.multiply(sumando.denominador);
        BigDecimal num1 = n.numerador.multiply(sumando.denominador);
        BigDecimal num2 = sumando.numerador.multiply(n.denominador);
        BigDecimal num = num1.add(num2);
        n.numerador = num;
        n.denominador = denComun;
        n.init();
        return n;
    }
    
    public Numero restar(Numero sustraendo){
        Numero n = copia();
        BigDecimal denComun = n.denominador.multiply(sustraendo.denominador);
        BigDecimal num1 = n.numerador.multiply(sustraendo.denominador);
        BigDecimal num2 = sustraendo.numerador.multiply(n.denominador);
        BigDecimal num = num1.subtract(num2);
        n.numerador = num;
        n.denominador = denComun;
        n.init();
        return n;
    }
    
    public Numero multiplicar(Numero multiplicando){
        Numero n = copia();
        n.numerador = n.numerador.multiply(multiplicando.numerador);
        n.denominador = n.denominador.multiply(multiplicando.denominador);
        n.init();
        return n;
    }
    
    public Numero dividir(Numero dividendo){
        Numero n = copia();
        n.numerador = n.numerador.multiply(dividendo.denominador);
        n.denominador = n.denominador.multiply(dividendo.numerador);
        n.init();
        return n;
    }
    
    public Numero copia(){
        Numero n;
        try {
            n = (Numero)this.clone();
        } catch (CloneNotSupportedException ex) {
            n = new Numero(valor);
        }
        return n;
    }
    
    @Override
    public String toString(){
        return numero;
    }
    
    public static void main(String[] args) {
        System.out.println(Matematicas.mcd(3, 5));
        Numero x = new Numero(BigDecimal.valueOf(100), true);
        Numero y = new Numero(BigDecimal.valueOf(7), true);
        System.out.println(x);
        System.out.println(x.toDecimal());
        System.out.println(x.toFracionario());
        System.out.println(x.multiplicar(y));
        System.out.println(x.dividir(y).toFracionario());
    }

    public BigDecimal getValor() {
        return valor;
    }
    
}
