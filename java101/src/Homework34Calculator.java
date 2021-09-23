import java.util.Scanner;

public class Homework34Calculator {
    private static Scanner scanner = new Scanner(System.in);

    static void plus() {
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scanner.nextInt();
            if (number == 0) break;
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scanner.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scanner.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void times() {
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scanner.nextInt();

            if (number == 1) break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void divided() {
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scanner.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void power() {
        System.out.print("Taban değeri giriniz :");
        int base = scanner.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++)
            result *= base;

        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        System.out.print("Sayı giriniz :");
        int n = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++)
            result *= i;

        System.out.println("Sonuç : " + result);
    }

    static void mod() {
        System.out.print("Sayi1: ");
        int n1 = scanner.nextInt();
        System.out.print("Sayi2: ");
        int n2 = scanner.nextInt();
        System.out.println("Sonuc: " + n1 % n2);
    }

    static void rectangle() {
        System.out.print("Kisa kenar: ");
        int shortEdge = scanner.nextInt();
        System.out.print("Uzun Kenar: ");
        int longEdge = scanner.nextInt();
        System.out.println("Alan: " + shortEdge * longEdge + "\tCevre: " + 2 * (shortEdge + longEdge));
    }


    public static void main(String[] args) {
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}