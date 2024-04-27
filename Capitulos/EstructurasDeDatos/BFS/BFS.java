package Capitulos.EstructurasDeDatos.BFS;

import java.util.*;

public class BFS {
    static List<Integer>[] grafo;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // BDS o Busqueda en Anchura es otro algoritmo aplicado en grafos, este busca
        // entre las relaciones de un nodo inicial por niveles, es decir, explora a
        // todos los conocidos de un nodo y luego pasa al siguiente, creando un árbol
        // más ancho, gracias a esta exploración nivel a nivel es capáz de encontrar el
        // camino más corto a un nodo objetivo. Al igual que el DFS, no vuelve a visitar
        // nodos ya explorados.
        // La lógica del BFS es bastante parecida a la empleada en el DFS con la única
        // diferencia de que emplea una cola en vez de una pila, este pequeño cambio
        // genera la exploración por niveles, descartando caminos que lleven al mismo
        // nodo pero ocupen más recorrido.
        // Al igual que con el DFS, usaremos el código empleado antes para generar
        // nuestro grafo, el input tambíen se repetirá.
        // Las nuevas entradas por teclado también se repetiran, pidiendo un nodo
        // inicial y un nodo objetivo.
        int nodos = scan.nextInt(); // Se lee el número de nodos que tendrá el Grafo
        int aristas = scan.nextInt(); // Se lee el número de aristas que tendrá el Grafo
        grafo = new LinkedList[nodos]; // Si instancia el tamaño del arreglo;
        for (int i = 0; i < nodos; i++) {
            grafo[i] = new LinkedList<Integer>(); // Se instancian listas vacias en todos los nodos
        }
        for (int i = 0; i < aristas; i++) {
            grafo[scan.nextInt()].add(scan.nextInt()); // Se leen y guardan las relaciones
        }
        bfs();
    }

    static boolean[] vis; // Se crea el ya conocido arreglo que evita redundancia

    public static void bfs() {
        System.out.println("Ingrese los nodos a buscar");
        int nodoInicial = scan.nextInt(); // Se lee el nodo donde inicia la busqueda
        int nodoObjetivo = scan.nextInt(); // Se lee el nodo al que se busca llegar
        Queue<Integer> kiwi = new LinkedList<>(); // Se instancia la cola de nodos a explorar
        int[] nivel = new int[grafo.length]; // Arreglo donde se guarda el nivel al que pertenece cada nodo
        vis = new boolean[grafo.length]; // Se instancia el arreglo de visitados
        kiwi.offer(nodoInicial); // Agregamos a la cola el nodo inicial
        nivel[nodoInicial] = 0; // Establecemos el nivel 0 para el nodo inicial
        while (!kiwi.isEmpty()) { // Mientras la cola no se encuentre vacia
            int nodoActual = kiwi.poll(); // Se empieza a explorar con el frente de la cola
            if (!vis[nodoActual]) { // Comprobamos que no se esté re visitando un nodo
                vis[nodoActual] = true; // Marcamos el nodo como visitado
                for (int i = 0; i < grafo[nodoActual].size(); i++) { // Se guardan a todos los nodos relacionados
                    int vecino = grafo[nodoActual].get(i);
                    if (!vis[vecino]) {
                        kiwi.offer(vecino); // Los nodos relacionados que no se hayan visitado se agregan a la cola
                        if (nivel[vecino] == 0) { // Si el nodo que estamos explorando aun no tiene designado un nivel
                            nivel[vecino] = nivel[nodoActual] + 1; // se le asigna el nivel del padre + 1
                        }
                    }
                }
            }
        }
        if (!vis[nodoObjetivo]) {
            System.out.print("No ");
        }
        System.out.println("se puede llegar del nodo " + nodoInicial + " al nodo " + nodoObjetivo);
        if (vis[nodoObjetivo]) { // En caso de existir un camino que conecte ambos nodos
            System.out.println("El nodo objetivo se encuentra en el nivel " + nivel[nodoObjetivo]);
        } // se muestra que tanto recorrido abarca el camino más corto al nodo objetivo
    }
}
