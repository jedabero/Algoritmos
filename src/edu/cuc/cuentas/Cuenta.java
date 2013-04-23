
package edu.cuc.cuentas;
/**
 *
 * @author Jedabero
 */

public class Cuenta {
    private Titular titular;
    private String numeroCuenta;
    private double saldo;
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
    
    public void consignar(double monto)/*throws Exception*/{
        if(monto > 0){
            saldo += monto; 
        }else{
            //throw new Exception("Monto Invalido");
        }
    }
    
    public boolean retirar(double monto)/*throws Exception*/{
        if((monto > 0)&&(monto <= saldo)){
            saldo -= monto;
            return true;
        }else{
            //throw new Exception("Monto Invalido");
            return false;
        }
    }
    
    public boolean transferir(Cuenta ctaOrigen, Cuenta ctaDest, double monto)
            /*throws Exception*/{
        if(monto > 0){
            if(ctaOrigen.retirar(monto)){
                ctaDest.consignar(monto);
                return true;
            }else{
                return false;
            }
        }else{
            //throw new Exception("Monto Invalido");
            return false;
        }
    }
    
    public void bloquear()/*throws Exception*/{
        if(cuentaActiva){
            cuentaActiva = false;
        }else{
            //throw new Exception("Cuenta ya inactiva");
        }
    }
    
}
