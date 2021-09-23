import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int yil = scanner.nextInt();
        if (yil%100 == 0 && yil%400 == 0 || yil%4 == 0)
            System.out.println("Artik yil");
        else
            System.out.println("Artik yil degil");

//        int sum = 0;
//        for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {
//            sum += i;
//            System.out.println("i:" + i + " j:" + j + " sum:" + sum);
//
//        }
//        System.out.println(sum);
    }
}