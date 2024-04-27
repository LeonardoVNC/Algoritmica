package Capitulos.SkillsPrograCompetitiva.Recursividad;

public class Recursividad {
    public static void main(String[] args) {
        // La recursividad es un concepto muy importante dentro de la programación, se
        // trata de una forma de abordar problemas bajo la idea de "Divide y Conquista",
        // es decir, dividimos problemas grandes en varios más pequeños, al final,
        // unimos todas las respuestas y obtenemos la respuesta del problema entero.
        // Un método recursivo tiene 2 partes esenciales, un caso de base y un llamado
        // recursivo.
        // El caso de base se refiere a la respuesta más básica al problema más pequeño.
        // El llamado recursivo se encarga de dividir el problema en varios más pequeños
        // Veamos como se emplearía un método recursivo para determinar el largo de la
        // congetura de collatz de cierto número:
        System.out.println(collatz(3));
    }

    public static int collatz(int n) {
        if (n == 1) {// Caso de base, la respuesta más básica es con la secuencia finalizada
            return 1;
        } else { // Llamado Recursivo, si no se cumple el caso de base, llamamos al método
            if (n % 2 == 0) {
                return 1 + collatz(n / 2);
            } else {
                return 1 + collatz(n * 3 + 1);
            }
        }
    }
}
