import java.util.Scanner;

public class Homework4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float km = 2.2f;
        int acilis = 10;

        float mesafe = scanner.nextFloat();

        double tutar = ( (km * mesafe + 10) < 20 ) ? 20 : (km * mesafe + 10);

        System.out.println(tutar);

//        if ( tutar < 20 ) {
//            System.out.println("tutar 20 TL");
//        } else {
//            System.out.println("tutar " + tutar + " TL");
//        }

    }
}