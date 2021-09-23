import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("gun: ");
        int gun = scanner.nextInt();
        System.out.print("ay: ");
        int ay = scanner.nextInt();

        if (ay == 12 && gun >= 22 || ay == 1 && gun <= 21)
            System.out.println("oglak");
        else if (ay == 1 || ay == 2 && gun <= 19)
            System.out.println("kova");
        else if (ay == 2 || ay == 3 && gun <= 20)
            System.out.println("balik");
        else if (ay == 3 || ay == 4 && gun <= 20)
            System.out.println("koc");
        else if (ay == 4 || ay == 5 && gun <= 21)
            System.out.println("boga");
        else if (ay == 5 || ay == 6 && gun <= 22)
            System.out.println("ikizler");
        else if (ay == 6 || ay == 7 && gun <= 22)
            System.out.println("yengec");
        else if (ay == 7 || ay == 8 && gun <= 22)
            System.out.println("aslan");
        else if (ay == 8 || ay == 9 && gun <= 22)
            System.out.println("basak");
        else if (ay == 9 || ay == 10 && gun <= 22)
            System.out.println("terazi");
        else if (ay == 10 || ay == 11 && gun <= 21)
            System.out.println("akrep");
        else if (ay == 11 || ay == 12)
            System.out.println("yay");
    }
}