package edu.cuc.cuentas;

/**
 *
 * @author Jedabero
 */
public class CuentaDoble extends Cuenta {

    private Titular titularSec;

    /**
     *
     */
    public CuentaDoble(Titular titular1, String numCuenta, Titular titSec) {
        super(titular1, numCuenta);
        this.titularSec = titSec;
    }
}
