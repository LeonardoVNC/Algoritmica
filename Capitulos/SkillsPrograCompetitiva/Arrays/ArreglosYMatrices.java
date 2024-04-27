package Capitulos.SkillsPrograCompetitiva.Arrays;

public class ArreglosYMatrices {
    public static void main(String[] args) {
        // Dentro de Java la estructura de datos más simple y básica es el Array o
        // Arreglo, es una estructura estática, de memoria contigua y Homogénea, es
        // decir, que no puede cambiar su tamaño, sus casillas de memoria se ubican lado
        // a lado (permitiendo una búsqueda de datos muy rápida) y solo admite un tipo
        // de dato.
        // Tienen 2 partes esenciales, el índice, que es el "lugar" que ocupa cierto
        // dato dentro del arreglo, y la información que guarda casa casilla de memoria.
        // Los arreglos inician con el índice 0 y llegan hasta el indice n-1, siendo n
        // el tamaño definido para el arreglo.
        // Los arreglos deben su velocidad a la forma en que se distribuye en la
        // memoria, pues con una simple operacion sabe a que indice del arreglo debe ir
        // para obtener el dato deseado.

        // La forma de instanciar un arreglo en java es la siguiente:
        // tipoDeDato[] nombre = new tipoDeDato[tamaño]
        // A continuación se intanciará un arreglo arr de ints con tamaño 5
        int[] arr = new int[5];

        // Para añadir datos al arreglo debemos indicar en que indice se ubicará el dato
        // a guardar, en seguida se asigna el valor como cualquier otro en java:
        arr[0] = 5; // Guardamos un 5 en el indice 0 del arreglo

        // Tambien se pueden llenar los datos con un for del siguiente modo:
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
        }
        // Como se puede notar, usamos un metodo del arreglo llamado lenght, este
        // devuelve el tamaño del arreglo, es especialmente util a la hora de recorrer
        // arreglos de los cuales se desconoce el tamaño

        // Tambien es posible definir los datos que tendra el arreglo al momento de
        // instanciarlo, del siguiente modo:
        int[] arr3 = { 11, 8, 13, 23, 18 }; // Definimos el tamaño y los datos del arreglo al instanciarlo

        // Si no guardamos ningun valor en el resto de casillas, debemos tener cuidado
        // dependiendo del tipo de dato que se usa, por ejemplo, al crear un arreglo de
        // ints, java rellena todas las casillas de memoria con 0, al hacer uno de
        // booleans se llena con false, pero si usamos un tipo de dato no nativo, como
        // Clases por ejemplo, las casillas quedaran en null, y tratar de pedir eldato
        // de una casilla en null lanzará una NullPointerException

        // A continuación tenemos a las matrices, que no son más que un arreglo de
        // arreglos, la lógica que sigue es la misma, con pequeño cambios.
        // Para instanciar una matriz hacemos lo siguiente:
        // tipoDeDato[][] nombre = new tipoDeDato[tamañoMatriz][tamañoArreglos]
        // Donde tamañoMatriz representa el tamaño del arreglo que contendra al resto de
        // arreglos, esto se representa mejor visualmente como se verá más adelante.
        // Del mismo modo, podemos definir una matriz desde que se instancia:
        int[][] mat = { arr, arr2, arr3, { 1, 2, 3, 4, 5 } };
        // En este caso, creamos una matriz compuesta de los primeros 3 arreglos que se
        // hicieron y un cuarto arreglo que se define al momento de instanciar la matriz.
        // Veamos como se ve esta matriz:
        mostrarMatriz(mat);
    }

    public static void mostrarMatriz(int[][] mat) {
        System.out.println("\nMostrando la Matriz indicada");
        for (int i = 0; i < mat.length; i++) {
            System.out.print("[" + mat[i][0]);
            for (int j = 1; j < mat[i].length; j++) {
                System.out.print("," + mat[i][j]);
            }
            System.out.println("]");
        }
     }
     
}
