package Capitulos.EstructurasDeDatos.Grafos;

import java.util.*;

public class Grafos {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Los grafos son un conjunto de pares ordenados que representan relaciones
        // entre Nodos, estas relaciones son llamadas Aristas. Las Aristas pueden ir en
        // una o dos direcciones, dependiendo del caso. A los grafos que contienen
        // unicamente aristas que relacionan nodos en ambas direcciones es los llama
        // Grafos No Dirigidos, en cambio, si se presenta por lo menos una arista que
        // condiciona la dirección de la relación, se le denominará como un Grafo
        // Dirigido.
        // Los grafos son especialmente útiles pues pueden representar relaciones
        // complejas de una manera más sencilla a los ojos de la programación, y es por
        // eso que tienen bastante relevancia en la materia.

        // Para instanciar un grafo se puede optar por 2 caminos que, dependiendo del
        // caso que se presente, serán más o menos eficientes que el otro

        // Grafos en Matriz
        // Se forman en matrices cuadradas, simulan una tabla de nxn, siendo n el numero
        // de nodos del grafo, en las filas y columnas se describirá que nodos tienen
        // una relación. Suele ser una matriz de ints, donde 1 representa una relación
        // unilateral, y 0 significa que no existe una relación.
        // Esta forma de representar Grafos resalta con grafos que incluyan un gran
        // número de aristas en comparación al número de nodos. Además presenta una gran
        // velocidad en la busqueda de datos en grafos con menos de 10k datos.
        // Para ver el funcionamiento de las matrices como forma de guardar un grafo,
        // ejecute las siguientes 2 líneas de código que de momento estarán comentadas.
        // Se le pedirá ingresar datos a traves del teclado, puede experimentar por su
        // parte o copiar el grafo dispuesto en el archivo input.txt

        // crearGrafoMat();
        // mostrarGrafoMat();

        // Grafos en listas
        // Se forma un arreglo que representa a los nodos del grafo, dentro de cada nodo
        // se almacenarán en listas las relaciones que tiene ese nodo específico.
        // Esta forma de representar Grafos resalta con grafos que tengan más nodos que
        // aristas, y aunque ocupa mucho espacio en la memoria, no pierde velocidad con
        // enormes cantidaddes de datos.
        // Al igual que con grafos en matrices, puede ejecutar las 2 siguientes líneas
        // de código para ver como se realiza un grafo representado en listas, del mismo
        // modo se le pedirá entrada de datos desde el teclado, pero también puede usar
        // el archivo input.txt

        // crearGrafoList();
        // mostrarGrafoList();

        // Tanto los grafos en Matrices como en Listas tienen un par de métodos extra
        // que se desarrollaron con la idea de facilitar la edición de Grafos, añadiendo
        // la creacion de Grafos No Dirigidos, la implementación de nuevos nodos y de
        // nuevas Aristas. Eres libre de probar el funcionamiento de estos métodos, usa
        // el método mostrarGrafo para ver los cambios que hagas.
    }

    // Código para la creación y graficación de grafos representados en Matrices
    static int[][] grafoMat; // Se establece una matriz,se instanciará con el tamaño adecuado después

    public static void crearGrafoMat() {
        int nodos = scan.nextInt(); // Se lee el número de nodos que tendrá el Grafo
        int aristas = scan.nextInt(); // Se lee el número de aristas que tendrá el Grafo
        grafoMat = new int[nodos][nodos]; // Se instancia la matriz del tamaño requerido
        for (int i = 0; i < aristas; i++) {
            grafoMat[scan.nextInt()][scan.nextInt()] = 1; // Se leen y guardan las relaciones
        }
    }

    public static void crearGrafoMatNoDirigido() {
        int nodos = scan.nextInt(); // Se lee el número de nodos que tendrá el Grafo
        int aristas = scan.nextInt(); // Se lee el número de aristas que tendrá el Grafo
        grafoMat = new int[nodos][nodos]; // Se instancia la matriz del tamaño requerido
        for (int i = 0; i < aristas; i++) {
            int nodoA = scan.nextInt();
            int nodoB = scan.nextInt(); // Se leen y guardan las relaciones
            grafoMat[nodoA][nodoB] = 1;
            grafoMat[nodoB][nodoA] = 1;
        }
    }

    public static void agregarNodosMat() {
        System.out.println("Ingrese cuantos nodos desea añadir");
        int nuevoTamanio = grafoMat.length + scan.nextInt(); // Se calcula el tamaño que tendra la nueva matriz
        int[][] nuevaMatriz = new int[nuevoTamanio][nuevoTamanio]; // Se crea una matriz temporal del tamaño deseado
        for (int i = 0; i < grafoMat.length; i++) {
            for (int j = 0; j < grafoMat.length; j++) {
                nuevaMatriz[i][j] = grafoMat[i][j]; // Se copian los datos de la matriz original a la temporal
            }
        }
        grafoMat = nuevaMatriz; // La matriz temporal sobreescribe a la antigua
    }

    public static void agregarAristasMat() {
        System.out.println("Ingrese por pares las nuevas aristas, escriba 0 0 para terminar");
        boolean func = true; // Booleano para mantener un ciclo controlado
        while (func) {
            int nodoPrincipal = scan.nextInt(); // Se lee el nodo al que se añadirá la arista
            int nodoRelacionado = scan.nextInt(); // Se lee el nodo que se relacionará
            if (nodoPrincipal == 0 && nodoRelacionado == 0) {
                func = false; // Caso que cierra el ciclo
            } else {
                grafoMat[nodoPrincipal][nodoRelacionado] = 1; // Se agrega la arista
            }
        }
    }

    public static void mostrarGrafoMat() {
        System.out.println("Se muestra el Grafo de Matriz:");
        for (int i = 0; i < grafoMat.length; i++) {
            System.out.print(i + " "); // Se muestra el nodo al que pertenecen las relaciones
            for (int j = 0; j < grafoMat.length; j++) {
                System.out.print("[" + grafoMat[i][j] + "]"); // Se muestran las relaciones
            }
            System.out.println();
        }
    }

    // Código para la creación y graficación de grafos representados en Listas
    static List<Integer>[] grafoList; // Se establece un arreglo de cadenas, el tamaño se define más adelante

    public static void crearGrafoList() {
        int nodos = scan.nextInt(); // Se lee el número de nodos que tendrá el Grafo
        int aristas = scan.nextInt(); // Se lee el número de aristas que tendrá el Grafo
        grafoList = new LinkedList[nodos]; // Si instancia el tamaño del arreglo;
        for (int i = 0; i < nodos; i++) {
            grafoList[i] = new LinkedList<Integer>(); // Se instancian listas vacias en todos los nodos
        }
        for (int i = 0; i < aristas; i++) {
            grafoList[scan.nextInt()].add(scan.nextInt()); // Se leen y guardan las relaciones
        }
    }

    public static void crearGrafoListNoDirigido() {
        int nodos = scan.nextInt(); // Se lee el número de nodos que tendrá el Grafo
        int aristas = scan.nextInt(); // Se lee el número de aristas que tendrá el Grafo
        grafoList = new LinkedList[nodos]; // Si instancia el tamaño del arreglo;
        for (int i = 0; i < nodos; i++) {
            grafoList[i] = new LinkedList<Integer>(); // Se instancian listas vacias en todos los nodos
        }
        for (int i = 0; i < aristas; i++) {
            int nodoA = scan.nextInt();
            int nodoB = scan.nextInt();
            grafoList[nodoA].add(nodoB); // Se leen y guardan las relaciones
            grafoList[nodoB].add(nodoA);
        }
    }

    public static void agregarNodosList() {
        System.out.println("Ingrese cuantos nodos desea añadir");
        int nuevoTamanio = grafoList.length + scan.nextInt(); // Se define el nuevo tamaño del arreglo
        List<Integer>[] grafoTemp = new LinkedList[nuevoTamanio]; // Se crea un grafo temporal con el tamaño necesario
        for (int i = 0; i < grafoList.length; i++) {
            grafoTemp[i] = grafoList[i]; // Se pasa la informacion del grafo original al temporal
        }
        for (int i = grafoList.length; i < nuevoTamanio; i++) {
            grafoTemp[i] = new LinkedList<Integer>(); // Se instancian listas vacias en los nodos nuevos
        }
        grafoList = grafoTemp; // El grafo temporal sobreescribe al antiguo
    }

    public static void agregarAristasList() {
        System.out.println("Ingrese por pares las nuevas aristas, escriba 0 0 para terminar");
        boolean func = true; // Booleano para mantener un ciclo controlado
        while (func) {
            int nodoPrincipal = scan.nextInt(); // Se lee el nodo al que se añadirá la arista
            int nodoRelacionado = scan.nextInt(); // Se lee el nodo que se relacionará
            if (nodoPrincipal == 0 && nodoRelacionado == 0) {
                func = false; // Caso que cierra el ciclo
            } else {
                grafoList[nodoPrincipal].add(nodoRelacionado); // Se agrega la arista
            }
        }
    }

    public static void mostrarGrafoList() {
        System.out.println("Se muestra el Grafo de Listas:");
        for (int i = 0; i < grafoList.length; i++) {
            System.out.print(i + " "); // Se muestra el nodo al que pertencen las relaciones
            for (int j = 0; j < grafoList[i].size(); j++) {
                System.out.print("[" + grafoList[i].get(j) + "]"); // Se muestran las relaciones
            }
            System.out.println();
        }
    }
}
