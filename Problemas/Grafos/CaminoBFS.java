package Problemas.Grafos;

import java.util.*;

public class CaminoBFS {
    static Scanner scan = new Scanner(System.in);
    static List<Integer>[] grafo;
    static int[] nivel;
    static boolean[] vis;
    static int[] padre;

    public static void main(String[] args) {
        crearGrafo();
        bfs();
    }

    public static void crearGrafo() {
        System.out.println("Ingrese la estructura del Grafo, N de Nodos, N de Aristas y las Aristas");
        int nodos = scan.nextInt();
        int aristas = scan.nextInt();
        grafo = new LinkedList[nodos];
        for (int i = 0; i < nodos; i++) {
            grafo[i] = new LinkedList<Integer>();
        }
        for (int i = 0; i < aristas; i++) {
            grafo[scan.nextInt()].add(scan.nextInt());
        }
    }

    public static void bfs() {
        System.out.println("Ingrese los nodos a buscar");
        int nodoInicial = scan.nextInt();
        int nodoObjetivo = scan.nextInt();
        Queue<Integer> kiwi = new LinkedList<>();
        nivel = new int[grafo.length];
        vis = new boolean[grafo.length];
        kiwi.offer(nodoInicial);
        nivel[nodoInicial] = 1;
        boolean nodoEncontrado = false;
        padre = new int[grafo.length];
        while (!kiwi.isEmpty() && !nodoEncontrado) {
            int nodoActual = kiwi.poll();
            if (nodoActual == nodoObjetivo) {
                nodoEncontrado = true;
                vis[nodoActual] = true;
                break;
            }
            if (!vis[nodoActual]) {
                vis[nodoActual] = true;
                for (int i = 0; i < grafo[nodoActual].size(); i++) {
                    int vecino = grafo[nodoActual].get(i);
                    if (!vis[vecino]) {
                        kiwi.offer(vecino);
                        if (nivel[vecino] == 0) {
                            nivel[vecino] = nivel[nodoActual] + 1;
                            padre[vecino] = nodoActual;
                        }
                    }
                }
            }
        }
        if (!vis[nodoObjetivo]) {
            System.out.println("No se puede llegar del nodo " + nodoInicial + " al nodo " + nodoObjetivo);
        } else {
            System.out.println("Se puede llegar del nodo " + nodoInicial + " al nodo " + nodoObjetivo);
            verCamino(nodoObjetivo);
        }
    }

    public static void verCamino(int nodoObjetivo) {
        System.out.println("El camino más corto pasa por " + nivel[nodoObjetivo] + " nodos");
        System.out.print("El camino comprende los nodos " + nodoObjetivo);
        int nodoActual = nodoObjetivo;
        for (int i = 1; i < nivel[nodoObjetivo]; i++) {
            nodoActual = padre[nodoActual];
            System.out.print(", " + nodoActual);
        }
        System.out.println();
    }
}
