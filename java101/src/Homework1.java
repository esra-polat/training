import java.util.Scanner;

public class Homework1{
    public static void main(String[] args) {
        float matematik, fizik, kimya, turkce, muzik;
        Scanner scanner = new Scanner(System.in);

        System.out.print("matematik: ");
        matematik = scanner.nextFloat();

        System.out.print("fizik: ");
        fizik = scanner.nextFloat();

        System.out.print("kimya: ");
        kimya = scanner.nextFloat();

        System.out.print("turkce: ");
        turkce = scanner.nextFloat();

        System.out.print("muzik: ");
        muzik = scanner.nextFloat();

        String sonuc = ((matematik + fizik + kimya + turkce + muzik) / 5 > 60) ? "sinifi gecti" : "sinifta kaldi";

        System.out.println(sonuc);

    }
}