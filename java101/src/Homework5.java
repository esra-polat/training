import java.util.Scanner;

public class Homework5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float pi = 3.14f;
        float r = scanner.nextFloat();
        float a = scanner.nextFloat();

        System.out.println((pi * (r*r) * a)/360);
    }
}