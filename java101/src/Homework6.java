import java.util.Scanner;

public class Homework6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float boy = scanner.nextFloat();
        float kg = scanner.nextFloat();

        System.out.println( kg / (boy * boy));
    }
}