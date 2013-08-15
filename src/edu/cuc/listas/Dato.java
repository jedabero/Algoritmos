package edu.cuc.listas;

/**
 *
 * @author jedabero
 */
public class Dato implements Comparable<Dato> {

    private int valor;
    private int id;

    public Dato(int valor, int id) {
        this.valor = valor;
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "Dato["+valor+"\t:"+id+"]";
    }

    @Override
    public int compareTo(Dato o) {
        if (valor > o.getValor()) {
            return 1;
        } else if (valor < o.getValor()) {
            return -1;
        }else{
            return 0;
        }
    }
    
}
