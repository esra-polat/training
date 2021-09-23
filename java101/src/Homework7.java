import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float armut = 2.14f;
        float elma = 3.67f;
        float domates = 1.11f;
        float muz = 0.95f;
        float patlican = 5.0f;

        float tutar = 0.0f;
        float kg;

        System.out.print("armut kac kg? ");
        kg = scanner.nextFloat();
        tutar += armut * kg;

        System.out.print("elma kac kg? ");
        kg = scanner.nextFloat();
        tutar += elma * kg;

        System.out.print("domates kac kg? ");
        kg = scanner.nextFloat();
        tutar += domates * kg;

        System.out.print("muz kac kg? ");
        kg = scanner.nextFloat();
        tutar += muz * kg;

        System.out.print("patlican kac kg? ");
        kg = scanner.nextFloat();
        tutar += patlican * kg;

        System.out.println("tutar " + tutar + " TL");
    }
}
