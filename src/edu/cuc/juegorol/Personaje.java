package edu.cuc.juegorol;

/**
 *
 * @author Jedabero
 */
public class Personaje {

    private String nombre;
    private String raza;
    private int fuerza;
    private int inteligencia;
    private int maxPuntosVida;
    private int puntosVida;

    public Personaje(String nombre, String raza, int fuerza, int intel, int hp) {
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        inteligencia = intel;
        maxPuntosVida = hp;
        puntosVida = hp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getMaxPuntosVida() {
        return maxPuntosVida;
    }

    public void setMaxPuntosVida(int maxPuntosVida) {
        this.maxPuntosVida = maxPuntosVida;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
}
