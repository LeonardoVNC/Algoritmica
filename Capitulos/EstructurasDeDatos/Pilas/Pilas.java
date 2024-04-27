import java.util.*;

public class Pilas {
    public static void main(String[] args) {
        // Las pilas son una estructura de datos que se rige por el sistema LIFO, Last
        // In First Out, es decir, que el último elemento añadido será el siguiente en
        // salir y también el único que se conocera hasta que salga de la pila.
        // Esto permite realizar operaciones con un T(n) minimo, pues al programa solo
        // le interesa el elemento que se encuentra en el tope de la pila, no necesita
        // conocer al resto de elementos

        // Para empezar, debemos crear una instancia de la Pila, para esto, se sigue la
        // siguiente estructura de código:

        // Stack<TipoDeDatoNoNativo> nombre = new Stack<>();

        // Es importante recordar que los tipos de datos no nativos se destacan en Java
        // por iniciar con una Mayúscula, tal como Integer, Boolean, String o cualquier
        // Clase dentro del Proyecto.
        // Ahora se creará una Pila de nombre pila que contenga al tipo de dato Integer:
        Stack<Integer> pila = new Stack<>();

        // Las pilas tienen 4 métodos principales:
        // Push
        // Sirve para añadir elementos a la pila, como tenemos una pila de Integers,
        // solo podemos ingresar números enteros del siguiente modo:
        for (int i = 1; i <= 6; i++) {
            pila.push(i);
            System.out.println("Se añade el elemento " + i + " a la pila");
        }

        // Pop
        // Cumple una doble función, sirve para eliminar un elemento de la pila, y
        // devuelve el valor del elemento eliminado, de modo que podremos guardar o usar
        // el elemento que sacamos, es importante destacar que en otros lenguajes esta
        // operación suele sacar el elemento pero no devolver su valor.
        // Se saca al tope de la pila, es decir, al 6:
        pila.pop();
        System.out.println("El tope se ha eliminado");
        // Se saca al tope y se lo guarda en a, es decir, a = 5:
        int a = pila.pop();
        System.out.println("El tope se ha guardado en a:" + a);
        // Se saca al tope y se lo usa inmediatamente, aqui se opera 6 + 4 y se guarda:
        int b = 6 + pila.pop();
        System.out.println("El tope se ha sacado y usado para calcular b:" + b);

        // Peek
        // Peek devuelve el valor del elemento que se encuentra en el tope, pero sin
        // eliminarlo de la pila. Este método toma mucha más relevancia en lenguajes
        // donde pop no devuelve al tope, pues se puede guardar el tope en un variable y
        // en seguida hacer pop del elemento.
        // Guardamos el tope, es decir 3, pero el tope se mantiene:
        int tope = pila.peek();
        System.out.println("El tope es " + tope);

        // Is Empty
        // Es un método booleano que comprueba si existe algun elemento dentro de la
        // Pila o si se encuentra vacía
        if (pila.isEmpty()) {
            System.out.println("La pila esta vacía");
        } else {
            System.out.println("La pila no esta vacía");
        }

        // Existen muchos otros métodos útiles para el trabajo con pilas, tales como
        // vaciarla con clear o comprobar el número de elementos dentro de la pila con
        // size, pero estos son los principales y los más usados pues tienen un T(n)
        // constante.
        // Con esto acaba la lección de pilas en Java.
    }
}
