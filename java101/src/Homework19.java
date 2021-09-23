import java.util.Scanner;

public class Homework19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        long c = fact(n) / (fact(r) * fact(n - r));
        System.out.println("Combination of (" + n + "," + r + ") : " + c);
    }

    public static long fact(int n) {

//        long result = 1;
//        for (int i = 1; i <= n ; i++) {
//            result *= i;
//        }

//        long result = 1;
//        int i = 1;
//        while (i <= n) {
//            result *= i;
//            i++;
//        }

        long result = 1;
        while (1 <= n) {
            result *= n;
            n--;
        }

        return result;
    }
}
