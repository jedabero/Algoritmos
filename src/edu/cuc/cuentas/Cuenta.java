package edu.cuc.cuentas;

/**
 *
 * @author Jedabero
 */
public class Cuenta {

    private Titular titular;
    private String numeroCuenta;
    protected double saldo;
    private Transaccion[] listaTransacciones;
    private boolean cuentaActiva;

    public Cuenta(Titular titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Transaccion[] getListaTransacciones() {
        return listaTransacciones;
    }

    public boolean isCuentaActiva() {
        return cuentaActiva;
    }

    public void consignar(double monto) throws Exception {
        if (monto > 0) {
            saldo += monto;
        } else {
            throw new Exception("Monto Invalido");
        }
    }

    public boolean retirar(double monto) throws Exception {
        if ((monto > 0) && (monto <= saldo)) {
            saldo -= monto;
            return true;
        } else {
            throw new Exception("Monto Invalido");
        }
    }

    public boolean transferir(Cuenta ctaDest, double monto) throws Exception {
        if (monto > 0) {
            if (retirar(monto)) {
                ctaDest.consignar(monto);
                return true;
            } else {
                return false;
            }
        } else {
            throw new Exception("Monto Invalido");
        }
    }

    public static boolean transferir(Cuenta ctaOrigen, Cuenta ctaDest, double monto)
            throws Exception {
        return ctaOrigen.transferir(ctaDest, monto);
    }

    public void bloquear() throws Exception {
        if (cuentaActiva) {
            cuentaActiva = false;
        } else {
            throw new Exception("Cuenta ya inactiva");
        }
    }

    public boolean igualTitular(Cuenta ct) {
        return getTitular().equals(ct.getTitular());
    }

    public static boolean igualTitular(Cuenta c1, Cuenta c2) {
        return c1.igualTitular(c2);
    }

    public boolean saldoMenorQue(double val) {
        return (saldo < val);
    }

    public Cuenta cuentaConSaldoMayor(Cuenta ct) {
        return (saldo >= ct.saldo) ? this : ct;
    }

    public static Cuenta cuentaConSaldoMayor(Cuenta ct1, Cuenta ct2) {
        return ct1.cuentaConSaldoMayor(ct2);
    }

    public boolean titularConLetra(char c) {
        return (getTitular().getApellidos().charAt(0) == c);
    }
}
