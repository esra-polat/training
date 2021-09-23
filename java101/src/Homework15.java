import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil = scanner.nextInt();
        if (yil%12 == 0)
            System.out.println("maymun");
        else if (yil%12 == 1)
            System.out.println("horoz");
        else if (yil%12 == 2)
            System.out.println("kopek");
        else if (yil%12 == 3)
            System.out.println("domuz");
        else if (yil%12 == 4)
            System.out.println("fare");
        else if (yil%12 == 5)
            System.out.println("okuz");
        else if (yil%12 == 6)
            System.out.println("kaplan");
        else if (yil%12 == 7)
            System.out.println("tavsan");
        else if (yil%12 == 8)
            System.out.println("ejderha");
        else if (yil%12 == 9)
            System.out.println("yilan");
        else if (yil%12 == 10)
            System.out.println("at");
        else if (yil%12 == 11)
            System.out.println("koyun");
    }
}