import java.util.Scanner;

public class Homework2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tutar = scanner.nextDouble();

        if (tutar > 0 && tutar < 1000) {
            System.out.print("KDV tutari: " + tutar*18/100 + "\tKDV'li tutar: " + (tutar+tutar*18/100));
        } if (tutar > 1000) {
            System.out.print("KDV tutari: " + tutar*8/100 + "\tKDV'li tutar: " + (tutar+tutar*8/100));
        }
    }
}
