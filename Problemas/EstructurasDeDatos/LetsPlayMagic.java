package Problemas.EstructurasDeDatos;

import java.util.*;

public class LetsPlayMagic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int cartas = Integer.valueOf(scan.nextLine());
            int c = cartas - 1;
            if (cartas == 0) {
                break;
            } else {
                String[][] in = new String[cartas][2];
                String[] out = new String[cartas];
                int indice = -1;
                for (int i = 0; i < cartas; i++) {
                    in[i] = scan.nextLine().split(" ");
                }
                for (int i = 0; i < cartas; i++) {
                    int n = in[i][1].length();
                    while (n != 0) {
                        if (indice == c) {
                            indice = 0;
                        } else {
                            indice++;
                        }
                        if (out[indice] == null) {
                            n--;
                        }
                    }
                    out[indice] = in[i][0];
                }
                for (int i = 0; i < c; i++) {
                    System.out.print(out[i] + " ");
                }
                System.out.println(out[c]);
            }
        }
        scan.close();
    }
}
