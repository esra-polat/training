import java.util.Scanner;

public class Homework35PowerRecursive {

    static int power(int base, int exp) {
        if (exp == 0 || base == 1) return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(power(scanner.nextInt(), scanner.nextInt()));
    }
}


