import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sicaklik: ");
        float sicaklik = scanner.nextFloat();

        if (sicaklik < 5)
            System.out.println("donarak kayak yapabilirsin");
        else if (sicaklik >= 5 && sicaklik < 15)
            System.out.println("sinemada misir kola yapabilirsin");
        else if (sicaklik >= 15 && sicaklik < 25)
            System.out.println("mangal yakip parktaki tum kedileri tavuklara cekebilirsin");
        else if (sicaklik >= 25)
            System.out.println("seni yuzme kurtarir dostum!");
    }
}
