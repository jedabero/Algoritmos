package edu.cuc.listas;

/**
 *
 * @author jberdugo10
 */
public class ListaPalabras {

    private String[] listadoPalabras;
    private int indicePalabra;

    public ListaPalabras() {
        listadoPalabras = new String[10];
        indicePalabra = 0;
    }

    public ListaPalabras(int dimLista) throws Exception {
        if (dimLista > 0) {
            listadoPalabras = new String[dimLista];
            indicePalabra = 0;
        } else {
            throw new Exception("Dimensión Invalida");
        }
    }

    public boolean adicionarPalabra(String palabraNueva) {
        if (!palabraNueva.isEmpty()) {
            if (indicePalabra < listadoPalabras.length) {
                listadoPalabras[indicePalabra] = palabraNueva;
                indicePalabra++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int buscarPos(String palabraBusqueda) {
        if (!palabraBusqueda.isEmpty()) {
            for (int i = 0; i < indicePalabra; i++) {
                if (palabraBusqueda.equals(listadoPalabras[i])) {
                    return i;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    public boolean buscar(String palabraBusqueda) {
        if (!palabraBusqueda.isEmpty()) {
            for (int i = 0; i < indicePalabra; i++) {
                if (palabraBusqueda.equals(listadoPalabras[i])) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public boolean eliminar(String palabraEliminar) {
        if (!palabraEliminar.isEmpty()) {
            int pos = buscarPos(palabraEliminar);
            if (pos != -1) {
                for (int i = pos; i < indicePalabra; i++) {
                    listadoPalabras[i] = listadoPalabras[i + 1];
                }
                indicePalabra--;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return visualizarLista();
    }

    public String visualizarLista() {
        String lista = "\n";
        for (int i = 0; i < indicePalabra; i++) {
            lista += (i + 1) + ". " + listadoPalabras[i] + "\n";
        }
        return lista;
    }

    public int contarPalabras(String palabra, int cantidad) {
        if (!palabra.isEmpty()) {
            if (indicePalabra > 0) {
                int cont = 0;
                for (int i = 0; i < indicePalabra; i++) {
                    if (palabra.length() == listadoPalabras[i].length()) {
                        cont++;
                    }
                }
                return cont;
            } else {
                return 0;
            }
        } else {
            return 0;
        }

    }

    public double promedioPalabras() throws Exception {
        if (indicePalabra > 0) {
            double sum = 0;
            for (int i = 0; i < indicePalabra; i++) {
                sum += listadoPalabras[i].length();
            }
            return sum / indicePalabra;
        } else {
            throw new Exception("Lista Vacía");
        }
    }

    public String contarElementosPromedio(String palabra) throws Exception {
        String lista = "";
        if (!palabra.isEmpty()) {
            double promedioActual = promedioPalabras();
            for (int i = 0; i < indicePalabra; i++) {
                if (listadoPalabras[i].length() > promedioActual) {
                    lista += "\n" + listadoPalabras[i];
                }
            }
            lista += "\n";
            return lista;
        } else {
            throw new Exception("Cadena vacía");
        }

    }

    public ListaPalabras palabrasComunes(ListaPalabras lista1,
            ListaPalabras lista2) throws Exception {
        ListaPalabras listaComun = new ListaPalabras(20);

        if ((lista1 != null) && (lista2 != null)) {
            for (int i = 0; i < indicePalabra; i++) {
                if (lista2.buscar(lista1.listadoPalabras[i])) {
                    listaComun.adicionarPalabra(lista1.listadoPalabras[i]);
                }
            }
            return listaComun;
        } else {
            throw new Exception("Lista nula");
        }
    }

    public int metodoPalabras(int numero, int cantidad) throws Exception {
        if ((indicePalabra > 0) && (numero > 0) && (cantidad > 0)) {
            int acum = 0;
            for (int i = indicePalabra - 1; i >= 0; i--) {
                if (numero % i == 0) {
                    if (listadoPalabras[i].length() != cantidad) {
                        acum += listadoPalabras[i].length();
                    }
                }
            }
            return acum;
        } else {
            throw new Exception("Datos incorrectos");
        }
    }
}
