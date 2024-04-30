package Problemas.EstructurasDeDatos;

import java.util.*;

public class PolePositions {
    public static void mainTablaCorredores(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            int nAutos = scan.nextInt();
            int[] inicial = new int[nAutos];
            boolean noSolution = false;
            if (nAutos == 0)
                break;
            for (int i = 0; i < nAutos; i++) {
                int auto = scan.nextInt();
                int pos = scan.nextInt();
                int a = i + pos;
                if (a >= nAutos || a < 0 || inicial[a] != 0) {
                    noSolution = true;
                    continue;
                }
                inicial[a] = auto;
            }
            if (!noSolution) {
                System.out.print(inicial[0]);
                for (int i = 1; i < nAutos; i++) {
                    System.out.print(" " + inicial[i]);
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
        scan.close();
    }
}
