
package edu.cuc.cuentas;


/**
 *
 * @author Jedabero
 */
public class Titular {
    
    
    private String nombres;
    private String apellidos;
    private String cedula;
    private String telefono;
    private String direccion;
    //private Date fechaNacimiento;
    
    public Titular(String nombres, String apellidos, String cedula){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
