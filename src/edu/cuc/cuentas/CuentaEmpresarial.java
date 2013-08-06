package edu.cuc.cuentas;

/**
 *
 * @author Jedabero
 */
public class CuentaEmpresarial extends Cuenta {

    private String numeroChequera;
    private double cupoSobreGiro;

    public CuentaEmpresarial(Titular titular, String numCuenta, String numCheq,
            double cupSobGir) {
        super(titular, numCuenta);
        this.numeroChequera = numCheq;
        this.cupoSobreGiro = cupSobGir;
    }
}
