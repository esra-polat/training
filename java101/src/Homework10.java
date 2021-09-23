import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args){
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

        double ort = (matematik + fizik + kimya + turkce + muzik) / 5;
//        String sonuc = ((matematik + fizik + kimya + turkce + muzik) / 5 > 60) ? "sinifi gecti" : "sinifta kaldi";

        if (ort > 100 || ort < 0)
            System.out.println("bu iste bir is var sanki ne dersin?");
        if (ort >= 55)
            System.out.println(ort + " ile sinifi gectin!");
        else
            System.out.println(ort + " ile sinifta kaldin!");
    }
}
