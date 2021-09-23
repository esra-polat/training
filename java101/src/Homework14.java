import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("mesafe: ");
        float mesafe = scanner.nextFloat();
        System.out.print("yas: ");
        int yas = scanner.nextInt();
        System.out.print("1>tek yon\n2>gidis donus\nyolculuk tipi: ");
        int yolculuk_tipi = scanner.nextInt();

        boolean chk = mesafe > 0 && yas > 0 && yolculuk_tipi == 1 || yolculuk_tipi == 2;

        double tutar = 0.10 * mesafe;

        if (!chk)
            System.out.println("hatali veri girdiniz");
        else if (yas<12)
            tutar = tutar*50/100;
        else if (yas < 24)
            tutar = tutar*90/100;
        else if (yas >= 65)
            tutar = tutar*70/100;

        if (!chk)
            System.out.println("tutar hesaplanamadi");
        else if (yolculuk_tipi == 2) {
            tutar = tutar * 80 / 100;
            System.out.println("tutar " + tutar*2);
        } else
            System.out.println("tutar " + tutar);

    }
}