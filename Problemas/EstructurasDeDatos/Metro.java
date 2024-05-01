package Problemas.EstructurasDeDatos;

import java.util.*;;

public class Metro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s1 = scan.nextInt() - 1;
        boolean ruta = false;
        scan.nextLine();
        String[] ida = scan.nextLine().split(" ");
        String[] vuelta = scan.nextLine().split(" ");
        if (ida[0].equals("0") || vuelta[s1].equals("0") && ida[s1].equals("0")) {
            ruta = false;
        } else {
            if (ida[s1].equals("1")) {
                ruta = true;
            } else {
                int i = s1;
                while (!ruta && i < n) {
                    if (vuelta[i].equals("1") && ida[i].equals("1")) {
                        ruta = true;
                    }
                    i++;
                }
            }
        }
        if (ruta) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scan.close();
    }
}
