package Capitulos.EstructurasDeDatos.Colas;

import java.util.*;

public class Colas {
    public static void main(String[] args) {
        // Las colas son una estructura de datos que se rige por el sistema FIFO, First
        // In First Out, es decir, que el primer elemento añadido será el siguiente en
        // salir y también el único que se conocera hasta que salga de la cola.
        // Al igual que con las pilas, permite realizar operaciones con un T(n) minimo.

        // Para empezar, debemos crear una instancia de la Cola, para esto, se sigue la
        // siguiente estructura de código:

        // Queue<TipoDeDatoNoNativo> nombre = new LinkedList<>();

        // Ahora se creará una Cola de nombre kiwi que contenga al tipo de dato Integer:
        Queue<Integer> kiwi = new LinkedList<>();

        // Las colas tienen 4 métodos principales:
        // Offer
        // Sirve para añadir elementos a la cola, como tenemos una cola de Integers,
        // solo podemos ingresar números enteros del siguiente modo:
        for (int i = 1; i <= 6; i++) {
            kiwi.offer(i);
            System.out.println("Se añade el elemento " + i + " a la cola");
        }

        // Poll
        // Al igual que pop en las Pilas, cumple la doble función de sacar al primer
        // elemento y devolver su valor para que se pueda guardar o usar ese mismo
        // momento.
        // Se saca al frente de la fila, es decir, al 1:
        kiwi.poll();
        System.out.println("El frente se ha eliminado");
        // Se saca al frente y se lo guarda en a, es decir, a = 2:
        int a = kiwi.poll();
        System.out.println("El frente se ha guardado en a:" + a);
        // Se saca al frente y se lo usa inmediatamente, aqui se opera 6 + 4 y se
        // guarda:
        int b = 6 + kiwi.poll();
        System.out.println("El frente se ha sacado y usado para calcular b:" + b);

        // Peek
        // Peek devuelve el valor del elemento que se encuentra en el frente, pero sin
        // eliminarlo de la cola.
        // Guardamos el frente, es decir 4, pero el tope se mantiene:
        int frente = kiwi.peek();
        System.out.println("El tope es " + frente);

        // Is Empty
        // Es un método booleano que comprueba si existe algun elemento dentro de la
        // cola o si se encuentra vacía
        if (kiwi.isEmpty()) {
            System.out.println("La cola esta vacía");
        } else {
            System.out.println("La cola no esta vacía");
        }

        // Existen muchos otros métodos útiles para el trabajo con colas, tales como
        // vaciarla con clear o comprobar el número de elementos dentro de la cola con
        // size, pero estos son los principales y los más usados pues tienen un T(n)
        // constante.
        // Con esto acaba la lección de colas en Java.
    }
}
