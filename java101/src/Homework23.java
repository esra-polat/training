import java.util.Scanner;

public class Homework23 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++)
                System.out.print(" ");

            for (int k = 1; k <= (2*i-1) ; k++)
                System.out.print("*");

            System.out.println();
        }

        int count = 1;
        for (int i = 1; i <= 2 * n - 1; i++) {

            for (int j = count; j <= n; j++)
                System.out.print(" ");

            for (int k = 1; k <= count * 2 - 1; k++)
                System.out.print("*");

            if (i < n)
                count++;
            else
                count--;

            System.out.println();
        }
    }
}
