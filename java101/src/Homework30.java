import java.util.Scanner;

public class Homework30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int num1 = 0, num2 = 1, num3;
        int counter = 0;

        while (counter < n) {
            System.out.print(num1 + " ");
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }
}
