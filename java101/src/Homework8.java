import java.util.Scanner;

public class Homework8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number1 > ");
        int n1 = scanner.nextInt();
        System.out.print("Number2 > ");
        int n2 = scanner.nextInt();

        System.out.print("1>Toplama\n2>Cikarma\n3>Carpma\n4>Bolme\nLutfen secim yapiniz: ");
        int secim = scanner.nextInt();

        System.out.print("\n\nsonuc:");

        switch (secim){
            case 1:
                System.out.print(n1+n2);
                break;
            case 2:
                System.out.print(n1-n2);
                break;
            case 3:
                System.out.print(n1*n2);
                break;
            case 4:
                if (n2 != 0)
                    System.out.print(n1 / n2);
                else
                    System.out.print(n1 + " sifira bolunemez!");
                break;
            default:
                System.out.println("Yanlis secim yaptiniz");
        }
    }
}
