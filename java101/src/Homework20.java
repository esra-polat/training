import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);
        int taban = scanner.nextInt();
        int us = scanner.nextInt();

        long sonuc = 1;

        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }

//        int i = 1;
//        while (i<=us) {
//            sonuc *= taban;
//            i++;
//        }

        System.out.println(taban + "^" + us + "= " + sonuc);
    }
}
