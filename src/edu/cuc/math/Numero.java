
package edu.cuc.math;

import java.math.BigDecimal;

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
        this.valor = numero;
        this.enDecimal = enDecimal;
        BigDecimal[] num = numero.divideAndRemainder(BigDecimal.ONE);
        BigDecimal integer = num[0].stripTrailingZeros();
        BigDecimal tempNum = num[1];
        int i = 0;
        while(tempNum.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) != 0)
        {
            tempNum = tempNum.multiply(BigDecimal.TEN).stripTrailingZeros();
            i++;
        }
        BigDecimal tempDen = BigDecimal.TEN.pow(i);
        BigDecimal mcd = Matematicas.mcd(tempNum, tempDen);
        tempNum = tempNum.divide(mcd);
        denominador = tempDen.divide(mcd);
        numerador = integer.multiply(denominador).add(tempNum);
        init();
    }
    
    private void init(){
        this.numero =""+((enDecimal)? valor : numerador+"/"+denominador);
    }
    
    public Numero toDecimal(){
        Numero n;
        try {
            n = (Numero)this.clone();
        } catch (CloneNotSupportedException ex) {
            n = new Numero(valor);
        }
        if(!enDecimal){
            n.enDecimal = true;
            n.init();
        }
        return n;
    }
    
    public Numero toFracionario(){
        Numero n;
        try {
            n = (Numero)this.clone();
        } catch (CloneNotSupportedException ex) {
            n = new Numero(valor);
        }
        if(enDecimal){
            n.enDecimal = false;
            n.init();
        }
        return n;
    }
    
    @Override
    public String toString(){
        return numero;
    }
    
    public static void main(String[] args) {
        Numero n = new Numero(BigDecimal.valueOf(Math.PI), true);
        System.out.println(n);
        System.out.println(n.toDecimal());
        System.out.println(n.toFracionario());
    }

    public BigDecimal getValor() {
        return valor;
    }
    
}
