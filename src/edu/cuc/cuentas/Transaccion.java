
package edu.cuc.cuentas;

import java.util.Date;


public class Transaccion {
    private String tipoTransaccion;
    private Date fechaTransaccion;
    private double monto;
    
    public Transaccion(String tipoTransaccion, Date fechaTransaccion,
             double monto){
        this.tipoTransaccion = tipoTransaccion;
        this.fechaTransaccion = fechaTransaccion;
        this.monto = monto;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
