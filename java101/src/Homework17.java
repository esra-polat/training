import java.util.Scanner;

public class Homework17 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int sum = 0;
        while (n>=0){
            if(n%3==0 && n%4==0)
                sum += n;
                count++;
            n--;
        }
        System.out.println("ort: " + sum/count);
    }
}
