package edu.cuc.cuentas;

/**
 *
 * @author Jedabero
 */
public class CuentaCondicionada extends Cuenta {

    public CuentaCondicionada(Titular t, String numCuenta) {
        super(t, numCuenta);
    }

    public void conignarAbono(double monto, double abono) throws Exception {
        if (abono > 0) {
            if (getSaldo() > 1000000) {
                consignar(abono);
            }
            consignar(monto);
        } else {
            throw new Exception("Valor Invalido");
        }
    }

    @Override
    public boolean retirar(double monto) throws Exception {
        if (monto <= getSaldo()) {
            if ((monto > 300000) && (getSaldo() > 5000000)) {
                retirar(10000);
            }
            return retirar(monto);
        } else {
            return false;
        }
    }

    @Override
    public boolean transferir(Cuenta ctaDest, double monto) throws Exception {
        if (getSaldo() > ctaDest.getSaldo()) {
            return transferir(ctaDest, monto);
        } else {
            return false;
        }
    }

    public static boolean transferir(Cuenta ctaOrigen, Cuenta ctaDest, double monto)
            throws Exception {
        return ctaOrigen.transferir(ctaDest, monto);
    }

    public void aplicarInteres() throws Exception {
        if ((getSaldo() > 1000000) && (getSaldo() < 5000000)) {
            saldo *= 1.05;
        } else {
            throw new Exception("No aplica");
        }
    }
}
