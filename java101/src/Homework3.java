import java.util.Scanner;

public class Homework3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double u = (a+b+c) / 2;

        System.out.print(Math.sqrt(u*(u-a)*(u-b)*(u-c)));
    }
}