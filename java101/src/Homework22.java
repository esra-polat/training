import java.util.Scanner;

public class Homework22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double harmonik = 0;
        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++)
            harmonik += 1.0/i;

//        for (double i = 1; i <= n ; i++)
//            harmonik += 1/i;
//
        System.out.println("sonuc: " + harmonik);
    }
}
