import java.util.Scanner;

public class Homework25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int ebob = 1;

        if (n1 < n2)
            System.out.println("ebob: " + ebob1(n1, n2));
        else
            System.out.println("ebob: " + ebob1(n2, n1));

        if (n1 < n2)
            System.out.println("ebob: " + ebob2(n1, n2));
        else
            System.out.println("ebob: " + ebob2(n2, n1));

        System.out.println("ekok: " + (n1 * n2) / ebob);
    }

    public static int ebob1(int m1, int m2) {
        int ebob = 1;
        for (int i = 1; i <= m1; i++) {
            if (m1 % i == 0 && m2 % i == 0)
                ebob = i;
        }
        return ebob;
    }

    public static int ebob2(int m1, int m2) {
        int ebob = 1;
        for (int i = m1; i >= 1; i--) {
            if (m1 % i == 0 && m2 % i == 0) {
                ebob = i;
                break;
            }
        }
        return ebob;
    }
}
