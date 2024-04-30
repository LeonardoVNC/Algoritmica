package Problemas.EstructurasDeDatos;
import java.util.*;

public class JollyJumpers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String[] arr = scan.nextLine().split(" ");
            int[] intArr = new int[arr.length - 1];
            Set<Integer> set = new HashSet<>();
            int n = Integer.valueOf(arr[0]);
            for (int i = 0; i < n; i++) {
                intArr[i] = Integer.valueOf(arr[i + 1]);
                set.add(i);
            }
            for (int i = 0; i < n - 1; i++) {
                set.remove(Math.abs(intArr[i] - intArr[i + 1]));
            }
            set.remove(0);
            if (set.isEmpty()) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }
        }
        scan.close();
    }
}
