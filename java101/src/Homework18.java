import java.util.Scanner;

public class Homework18 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        boolean state = true;
        int sum = 0;
        int n;
        while (state) {
            n = scanner.nextInt();
            if (n % 2 == 0) {
                if (n % 4 == 0)
                    sum += n;
            } else {
                state = false;
            }
        }
        System.out.println("toplam: " + sum);
    }
}
