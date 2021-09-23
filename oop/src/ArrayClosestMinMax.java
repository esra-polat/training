import java.util.Arrays;
import java.util.Scanner;

public class ArrayClosestMinMax {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ind = 0;
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            if (list[i] > n && list[i] != n) {
                ind = i;
                break;
            }
        }
        System.out.println(list[ind-1] + " " + list[ind]);
    }
}
