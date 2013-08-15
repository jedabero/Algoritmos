package edu.cuc.listas;

/**
 *
 * @author jedabero
 */
public class Pila {

    private int tope;
    private int maxPila;
    private Dato[] listaDatos;

    public Pila(int maxP) {
        tope = -1;
        maxPila = maxP;
        listaDatos = new Dato[maxPila];
    }

    public int cima() {
        return tope;
    }

    public int maximoPila() {
        return maxPila;
    }

    public boolean pilaLlena() {
        return cima() == maximoPila() - 1;
    }

    public boolean pilaVacia() {
        return cima() == -1;
    }

    public boolean insertar(int v) {
        if (!pilaLlena()) {
            tope++;
            Dato nd = new Dato(v, tope);
            listaDatos[tope] = nd;
            return true;
        } else {
            return false;
        }
    }

    public int buscarPosicion(int d) {
        int pos = -1;
        int i = 0;
        while ((listaDatos[i].getValor() != d) && (i < cima())) {
            i++;
        }
        return (i < cima()) ? i : pos;
    }

    public Dato quitar() {
        Dato nd = listaDatos[tope];
        tope--;
        return nd;
    }

    public Dato quitar(int index) {
        Dato temp;
        for (int i = index; i < cima(); i++) {
            temp = listaDatos[i + 1];
            temp.setId(i);
            listaDatos[i] = temp;
        }
        listaDatos[cima()] = null;
        tope--;
        Dato nd = listaDatos[index];
        return nd;
    }

    public boolean quitar(Dato d) {
        boolean removed = false;
        int pos = buscarPosicion(d.getValor());
        while (pos >= 0) {
            quitar(pos);
            removed = true;
            pos = buscarPosicion(d.getValor());
        }
        return removed;
    }

    public void vaciarPila() {
        Dato ap;
        while (!pilaVacia()) {
            ap = quitar();
        }
    }

    public void cambiar(int pos1, int pos2) {
        Dato temp = listaDatos[pos2];
        temp.setId(pos1);
        listaDatos[pos1].setId(pos2);
        listaDatos[pos2] = listaDatos[pos1];
        listaDatos[pos1] = temp;
    }

    public void bubbleSort() {
        long t0 = System.currentTimeMillis();
        boolean changed;
        do {
            changed = false;
            for (int j = 0; j < cima(); j++) {
                if (listaDatos[j].getValor() > listaDatos[j + 1].getValor()) {
                    cambiar(j, j + 1);
                    changed = true;
                }
            }
        } while (changed);
        long dt = System.currentTimeMillis() - t0;
        System.out.println("Time(ms):" + (dt));
    }

    public void bubbleSortOptimized() {
        long t0 = System.currentTimeMillis();
        boolean changed;
        int n = cima();
        do {
            changed = false;
            for (int j = 0; j < n; j++) {
                if (listaDatos[j].getValor() > listaDatos[j + 1].getValor()) {
                    cambiar(j, j + 1);
                    changed = true;
                }
            }
            n--;
        } while (changed);
        long dt = System.currentTimeMillis() - t0;
        System.out.println("Time(ms):" + (dt));
    }

    private int sort(int first, int last) {
        int pivot = listaDatos[(first+last)/2].getValor();
        int i = first;
        int j = last;
        while (i < j) {
            while ((listaDatos[i].getValor() > pivot) && (i < last)) {
                i++;
            }
            while ((listaDatos[j].getValor() <= pivot) && (j > first)) {
                j--;
            }

            if ((i == first) && (j == i)) {
                quickSort(first + 1, last, false);
            }
            if ((i == last) && (j == i)) {
                quickSort(first, last - 1, false);
            }

            if (i < j) {
                cambiar(i, j);
            }
        }

        return j;
    }

    public void quickSort(int first, int last, boolean isLast) {
        long t0 = System.currentTimeMillis();
        //if (first < last) {
            //int k = sort(first, last);
            //System.out.println(k);
            //quickSort(first, k, false);
            //quickSort(k + 1, last, false);
        //}
        java.util.Arrays.sort(listaDatos);
        if (isLast) {
            long dt = System.currentTimeMillis() - t0;
            System.out.println("Time(ms):" + (dt));
        }
    }

    @Override
    public String toString() {
        String res = "Lista de datos\n[Valor\t:Index]\n";
        for (int i = 0; i < maxPila; i++) {
            res += (listaDatos[i] + "\n").substring(4);
        }
        return res;
    }
}
