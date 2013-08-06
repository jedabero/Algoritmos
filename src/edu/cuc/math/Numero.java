package edu.cuc.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Jedabero
 */
public class Numero implements Cloneable {

    private String numero = "";
    private BigDecimal valor;
    private BigDecimal numerador;
    private BigDecimal denominador;
    private boolean enDecimal = false;

    /**
     *
     * @param value
     */
    public Numero(BigDecimal numero) {
        this(numero, false);
    }

    public Numero(BigDecimal numero, boolean enDecimal) {
        //Inicializando variables
        this.valor = numero;
        this.enDecimal = enDecimal;
        //Obteniendo parte entera y decimal numero
        BigDecimal[] num = valor.divideAndRemainder(BigDecimal.ONE);
        boolean intZero = num[0].compareTo(BigDecimal.ZERO) == 0;
        BigDecimal integer = (intZero) ? BigDecimal.ZERO : num[0].stripTrailingZeros();
        BigDecimal tempNum = num[1];
        //Multiplicando la parte decimal por 10 hasta que sea entera
        int i = 0;
        while (tempNum.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) != 0) {
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

    private void init() {
        valor = numerador.divide(denominador, 9, RoundingMode.HALF_UP).stripTrailingZeros();
        boolean denEq1 = denominador.compareTo(BigDecimal.ONE) == 0;
        numero = "" + ((enDecimal) ? valor.toPlainString() : numerador + ((denEq1) ? "" : "/" + denominador));
    }

    private void simplificar() {
        //Maximo común divisor
        BigDecimal mcd = Matematicas.mcd(numerador, denominador);
        System.out.println("n/d : " + numerador + "/" + denominador);
        System.out.println("mcd(n,d)=" + mcd);
        int mcds = mcd.signum();    //TODO dividing by a negative number
        if (mcd.abs().compareTo(BigDecimal.ONE) != 0) {
            //Se simplifica la fracción
            numerador = numerador.divide(mcd);
            denominador = denominador.divide(mcd);
        } else if (mcd.signum() == -1) {
            int ns = numerador.signum();
            int ds = denominador.signum();
        }
        init();
    }

    public Numero toDecimal() {
        Numero n = copia();
        if (!enDecimal) {
            n.enDecimal = true;
            n.init();
        }
        return n;
    }

    public Numero toFracionario() {
        Numero n = copia();
        if (enDecimal) {
            n.enDecimal = false;
            n.init();
        }
        return n;
    }

    public Numero sumar(Numero sumando) {
        Numero n = copia();
        BigDecimal denComun = n.denominador.multiply(sumando.denominador);
        BigDecimal num1 = n.numerador.multiply(sumando.denominador);
        BigDecimal num2 = sumando.numerador.multiply(n.denominador);
        BigDecimal num = num1.add(num2);
        n.numerador = num;
        n.denominador = denComun;
        n.simplificar();
        return n;
    }

    public Numero restar(Numero sustraendo) {
        Numero n = copia();
        BigDecimal denComun = n.denominador.multiply(sustraendo.denominador);
        BigDecimal num1 = n.numerador.multiply(sustraendo.denominador);
        BigDecimal num2 = sustraendo.numerador.multiply(n.denominador);
        BigDecimal num = num1.subtract(num2);
        n.numerador = num;
        n.denominador = denComun;
        n.simplificar();
        return n;
    }

    public Numero multiplicar(Numero multiplicando) {
        Numero n = copia();
        n.numerador = n.numerador.multiply(multiplicando.numerador);
        n.denominador = n.denominador.multiply(multiplicando.denominador);
        n.simplificar();
        return n;
    }

    public Numero dividir(Numero dividendo) {
        Numero n = copia();
        n.numerador = n.numerador.multiply(dividendo.denominador);
        n.denominador = n.denominador.multiply(dividendo.numerador);
        System.out.println("--n/d=" + numerador + " / " + denominador);
        n.simplificar();
        return n;
    }

    public static Numero fraccion(BigDecimal numerador, BigDecimal denominador) {
        Numero n = new Numero(numerador);
        Numero d = new Numero(denominador);
        return fraccion(n, d);
    }

    public static Numero fraccion(Numero numerador, Numero denominador) {
        return numerador.dividir(denominador);
    }

    public Numero copia() {
        Numero n;
        try {
            n = (Numero) this.clone();
        } catch (CloneNotSupportedException ex) {
            n = new Numero(valor);
        }
        return n;
    }

    @Override
    public String toString() {
        return numero;
    }

    public static void main(String[] args) {
        Numero x = new Numero(BigDecimal.valueOf(10.5), false);
        Numero y = new Numero(BigDecimal.valueOf(-7), true);
        Numero f = Numero.fraccion(BigDecimal.valueOf(10.5), BigDecimal.valueOf(-7));
        Numero f2 = Numero.fraccion(x, y);
        System.out.println("x = " + x);
        System.out.println("x(d) = " + x.toDecimal());
        System.out.println("x(f) = " + x.toFracionario());
        System.out.println("x*y = " + x.multiplicar(y));
        System.out.println("10.5/-7 = " + f);
        System.out.println("x/y = " + f2);
    }

    public BigDecimal getValor() {
        return valor;
    }
}
