
package edu.cuc.juegorol;

/**
 *
 * @author Jedabero
 */
public class Mago extends Personaje {
    
    
    
    public Mago(String nombre, int fuerza, int intel, int hp){
        super(nombre, "mago", fuerza, intel, hp);
        if(getInteligencia()<17){
            setInteligencia(17);
        }else if (getFuerza()>15) {
            setFuerza(15);
        }
    }
    
}
