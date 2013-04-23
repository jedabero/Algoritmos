
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
    
    public Personaje(String nombre, String raza, int fuerza, int intel, int hp){
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        inteligencia = intel;
        maxPuntosVida = hp;
    }
    
}
