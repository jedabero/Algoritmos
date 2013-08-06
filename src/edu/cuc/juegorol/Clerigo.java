package edu.cuc.juegorol;

/**
 *
 * @author Jedabero
 */
public class Clerigo extends Personaje {

    public Clerigo(String nombre, int fuerza, int intel, int hp) {
        super(nombre, "mago", fuerza, intel, hp);
        if (getFuerza() < 18) {
            setFuerza(18);
        } else if (getInteligencia() < 12) {
            setInteligencia(12);
        } else if (getInteligencia() > 16) {
            setInteligencia(16);
        }
    }

    public boolean curar(Personaje p) {
        int hp = p.getPuntosVida();
        int maxHP = p.getMaxPuntosVida();
        if (hp < maxHP) {
            if (hp + 10 <= maxHP) {
                p.setPuntosVida(hp + 10);
            } else {
                p.setPuntosVida(maxHP);
            }
            return true;
        } else {
            return false;
        }
    }
}
