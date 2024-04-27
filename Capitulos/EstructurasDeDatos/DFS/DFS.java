package Capitulos.EstructurasDeDatos.DFS;

import java.util.*;

public class DFS {
    static List<Integer>[] grafo;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // DFS o Recorrido en Profundidad es un algoritmo aplicado en grafos que busca
        // en posibles casos a travez de los nodos conocidos del nodo inicial, avanzando
        // por el grafo a travez de las relaciones entre nodos, encuentra un camino a un
        // nodo requerido haciendo apoyo del backtracking. No vuelve a visitar nodos ya
        // explorados, esta centrado en buscar un camino, no necesariamente el más
        // rápido.
        // La lógica detras del DFS es algo sencilla, se crea una pila donde se
        // introduce el nodo inicial, se saca al tope de la pila y se le marca como
        // visitado para evitar que se vuelva a explorar su camino, además, se
        // registrarán los nodos con los que se relaciona y se ingresan a la pila. Se
        // saca al tope nuevamente y el ciclo sigue hasta que se vacie la cola y se
        // hallan visitado todos los nodos del grupo. Si existe un camino que conecte 2
        // nodos, ambos nodos se encontrarán visitados, caso contrario, no existe un
        // camino que los conecte-
        // Para empezar con el DFS, antes que nada debemos tener un grafo, para lo cual
        // usaremos el código hecho en la sección anterior, también se proporcionará el
        // mismo input para agilizar el proceso.
        // Se pediran 2 nuevas entradas desde el teclado, ingrese 2 nodos, uno desde el
        // que se iniciará la busqueda y otro que se comprabará si existe un camino que
        // los conecte. Los nodos deben existir dentro del grafo o saltará una excepcion

        int nodos = scan.nextInt(); // Se lee el número de nodos que tendrá el Grafo
        int aristas = scan.nextInt(); // Se lee el número de aristas que tendrá el Grafo
        grafo = new LinkedList[nodos]; // Si instancia el tamaño del arreglo;
        for (int i = 0; i < nodos; i++) {
            grafo[i] = new LinkedList<Integer>(); // Se instancian listas vacias en todos los nodos
        }
        for (int i = 0; i < aristas; i++) {
            grafo[scan.nextInt()].add(scan.nextInt()); // Se leen y guardan las relaciones
        }
        dfs();
    }

    static boolean[] vis; // Se crea un arreglo de booleanos que indicará si ya se ha recorrido el camino
                          // de un nodo, esto para evitar repeticiones.

    public static void dfs() {
        System.out.println("Ingrese los nodos a buscar");
        int nodoInicial = scan.nextInt(); // Se lee el nodo donde inicia la busqueda
        int nodoObjetivo = scan.nextInt(); // Se lee el nodo al que se busca llegar
        Stack<Integer> pila = new Stack<>(); // Se instancia la pila donde se guardaran los nodos a explorar
        pila.push(nodoInicial); // Se mete al nodo inicial para empezar la busqueda
        vis = new boolean[grafo.length]; // Se establece el arreglo de visitados
        while (!pila.isEmpty()) { // Mientras la pila no se encuentre vacía
            int nodoActual = pila.pop(); // Se empieza a explorar con el tope de la pila
            if (!vis[nodoActual]) { // Comprobamos que no se esté re visitando un nodo
                vis[nodoActual] = true; // Marcamos el nodo como visitado para no repetirlo
                for (int i = 0; i < grafo[nodoActual].size(); i++) { // Se guardan a todos los nodos relacionados
                    int vecino = grafo[nodoActual].get(i);
                    if (!vis[vecino]) {
                        pila.push(vecino); // Los nodos relacionados que no se hayan visitado entran a la pila
                    }
                }
            }
        }
        if (!vis[nodoObjetivo]) { // Si no se ha visitado el nodo objetivo entonces no existe un modo de llegar
            System.out.print("No ");
        }
        System.out.println("se puede llegar del nodo " + nodoInicial + " al nodo " + nodoObjetivo);
    }

}
