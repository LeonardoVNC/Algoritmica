package Capitulos.SkillsPrograCompetitiva.FuncionesYProcedimientos;

public class FuncionesYProcedimientos {
    public static void main(String[] args) {
        // La diferencia entre funciones y procedimientos es bastante sencilla, se trata
        // del tipo de retorno que tienen, una función es un método que devuelve un
        // valor luego de completarse, en cambio, un procedimiento no devuelve valor,
        // solo ejecuta pasos sin devolver respuesta, es decir, un metodo void.

        // Para recordar, veamos un método sin tipo de retorno en:
        saludar();
        // Como se puede apreciar, su tipo de retorno es void, pues no devuelve una
        // respuesta, aun si entrega una respuesta al system.out, no es información que
        // se pueda emplear despues en el programa, solo es una interaccion con el
        // usuario

        // En cambio, un método con retorno se puede apreciar en:
        sumar(8, 16);
        // Si bien no lo notamos visualmente, el método ha entregado una respuesta, esto
        // lo podemos comprobar si guardamos la respuesta en una variable o si la
        // usamos:
        System.out.println("La respuesta del método sumar es " + sumar(8, 16));
        // Como se puede apreciar, esta función devuelve una respuesta según los
        // parametros que se le dan, esta respuesta se puede utilizar más adelante en el
        // programa sin mayor problema
    }

    public static void saludar() {
        System.out.println("Hola, soy un procedimiento");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
}
