
/**
 * Write a description of class Nodo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 class Nodo {
    int dato;
    Nodo izquierdo, derecho;

    public Nodo(int item) {
        dato = item;
        izquierdo = derecho = null;
    }
}