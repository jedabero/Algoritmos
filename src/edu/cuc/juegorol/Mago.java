
package edu.cuc.juegorol;

/**
 *
 * @author Jedabero
 */
public class Mago extends Personaje {
    
    private String hechizos[] = new String[4];
    
    public Mago(String nombre, int fuerza, int intel, int hp){
        super(nombre, "mago", fuerza, intel, hp);
        if(getInteligencia()<17){
            setInteligencia(17);
        }else if (getFuerza()>15) {
            setFuerza(15);
        }
    }
    
    public int nuevoHechizo(String hechizo){
        for (int i = 0; i < hechizos.length; i++) {
            if(hechizos[i] != null){
                hechizos[i] = hechizo;
                return i;
            }
        }
        return -1;
    }
    
    public boolean eliminarHechizo(int n) throws Exception{
        if(n<4){
            hechizos[n] = null;
            return true;
        }else{
            throw new Exception("No hay tal hechizo");
        }
        
    }
    
    public boolean atacar(Personaje p, int numHecz) throws Exception{
        int hp = p.getPuntosVida();
        
        if(eliminarHechizo(numHecz)){
            p.setPuntosVida(hp-10);
            return true;
        }else{
            return false;
        }
        
    }
    
    
    
}
