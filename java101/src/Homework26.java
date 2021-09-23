import java.util.Scanner;

public class Homework26 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int min = 0, max = 0;
        int n = 1;
        while (n != 0) {
            n = scanner.nextInt();
            if (n<min)
                min = n;
            if (n>max)
                max = n;
        }

        System.out.println("min:" + min + "\nmax:" + max);
    }
}
