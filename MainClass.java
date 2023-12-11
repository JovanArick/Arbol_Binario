public class MainClass {
    public static void main(String[] args) {
        ABB arbol = new ABB();

        arbol.insertarValor(50);
        arbol.insertarValor(30);
        arbol.insertarValor(20);
        arbol.insertarValor(40);
        arbol.insertarValor(70);
        arbol.insertarValor(60);
        arbol.insertarValor(80);

        System.out.println("Árbol Binario de Búsqueda (ABB) Impreso de Forma Horizontal:");
        arbol.imprimirArbolHorizontal();

        int valorABuscar = 40;
        if (arbol.buscarNodo(valorABuscar)) {
            System.out.println("Nodo con valor " + valorABuscar + " encontrado en el árbol.");
        } else {
            System.out.println("Nodo con valor " + valorABuscar + " no encontrado en el árbol.");
        }

        System.out.println("\nRecorrido Preorden:");
        arbol.recorrerPreOrden();

        System.out.println("\nRecorrido Inorden:");
        arbol.recorrerInOrden();

        System.out.println("\nRecorrido Postorden:");
        arbol.recorrerPostOrden();

        int valorAEliminar = 30;
        arbol.eliminarNodo(valorAEliminar);
        System.out.println("\nÁrbol después de eliminar el nodo con valor " + valorAEliminar + ":");
        arbol.imprimirArbolHorizontal();
    }
}