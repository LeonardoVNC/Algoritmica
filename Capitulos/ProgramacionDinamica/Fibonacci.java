package Capitulos.ProgramacionDinamica;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        Arrays.fill(fibo, -1);
        System.out.println(finbonacci(6));
    }

    static long[] fibo = new long[10000];

    public static long finbonacci(long n) {
        if (fibo[(int)(n)] == -1) {
            if (n <= 0) {
                fibo[(int)(n)] = 0;
                return 0;
            } else if (n == 1) {
                fibo[(int)(n)] = 1;
                return 1;
            } else {
                long a = finbonacci(n - 1) + finbonacci(n - 2);
                fibo[(int)(n)] = a;
                return a;
            }
        } else {
            return fibo[(int)(n)];
        }
    }
}
