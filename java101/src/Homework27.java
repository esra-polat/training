import java.util.Scanner;

public class Homework27 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int tmp=0;
        for (int i = 1; i < n; i++) {
            if (n%i==0)
                tmp += i;
        }
        System.out.println(n==tmp ? "mukemmel sayi" : "mukemmel sayi degil");
    }
}
