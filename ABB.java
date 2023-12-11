
/**
 * Write a description of class ABB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ABB
{private Nodo raiz;

    ABB() {
        this.raiz = null;
    }

    public boolean esVacio() {
        return (this.raiz == null);
    }

    public void insertarValor(int valor) {
        raiz = insertarNodo(raiz, valor);
    }

    private Nodo insertarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.dato) {
            nodo.izquierdo = insertarNodo(nodo.izquierdo, valor);
        } else if (valor > nodo.dato) {
            nodo.derecho = insertarNodo(nodo.derecho, valor);
        }

        return nodo;
    }

    public void imprimirArbolHorizontal() {
        imprimirArbolHorizontal(raiz, 0);
    }

    private void imprimirArbolHorizontal(Nodo nodo, int nivel) {
        if (nodo != null) {
            imprimirArbolHorizontal(nodo.derecho, nivel + 1);

            for (int i = 0; i < nivel; i++) {
                System.out.print("   ");
            }

            System.out.println("[" + nodo.dato + "]");
            imprimirArbolHorizontal(nodo.izquierdo, nivel + 1);
        }
    }

    public boolean buscarNodo(int valor) {
        return buscarNodo(raiz, valor);
    }

    private boolean buscarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        }

        if (valor == nodo.dato) {
            return true;
        } else if (valor < nodo.dato) {
            return buscarNodo(nodo.izquierdo, valor);
        } else {
            return buscarNodo(nodo.derecho, valor);
        }
    }

    public void recorrerPreOrden() {
        recorrerPreOrden(raiz);
    }

    private void recorrerPreOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            recorrerPreOrden(nodo.izquierdo);
            recorrerPreOrden(nodo.derecho);
        }
    }

    public void recorrerInOrden() {
        recorrerInOrden(raiz);
    }

    private void recorrerInOrden(Nodo nodo) {
        if (nodo != null) {
            recorrerInOrden(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            recorrerInOrden(nodo.derecho);
        }
    }

    public void recorrerPostOrden() {
        recorrerPostOrden(raiz);
    }

    private void recorrerPostOrden(Nodo nodo) {
        if (nodo != null) {
            recorrerPostOrden(nodo.izquierdo);
            recorrerPostOrden(nodo.derecho);
            System.out.print(nodo.dato + " ");
        }
    }

    public void eliminarNodo(int valor) {
        raiz = eliminarNodo(raiz, valor);
    }

    private Nodo eliminarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            return nodo;
        }

        if (valor < nodo.dato) {
            nodo.izquierdo = eliminarNodo(nodo.izquierdo, valor);
        } else if (valor > nodo.dato) {
            nodo.derecho = eliminarNodo(nodo.derecho, valor);
        } else {
            if (nodo.izquierdo == null) {
                return nodo.derecho;
            } else if (nodo.derecho == null) {
                return nodo.izquierdo;
            }

            nodo.dato = encontrarMinimo(nodo.derecho);
            nodo.derecho = eliminarNodo(nodo.derecho, nodo.dato);
        }

        return nodo;
    }

    private int encontrarMinimo(Nodo nodo) {
        int minimo = nodo.dato;
        while (nodo.izquierdo != null) {
            minimo = nodo.izquierdo.dato;
            nodo = nodo.izquierdo;
        }
        return minimo;
    }
}


