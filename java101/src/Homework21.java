import java.util.Scanner;

public class Homework21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();

        int tempSayi = sayi, sonBasamak, basamakKuvvet;
        int toplam = 0, basamakSayisi = 0;

        while (tempSayi != 0) {
            tempSayi /= 10;
            basamakSayisi++;
        }

        tempSayi = sayi;
        while (tempSayi != 0) {
            sonBasamak = tempSayi % 10;

            basamakKuvvet = 1;
            for (int i = 1; i <= basamakSayisi; i++)
                basamakKuvvet *= sonBasamak;

            toplam += basamakKuvvet;
            tempSayi /= 10;

//            toplam += Math.pow(sonBasamak, basamakSayisi);
        }

        System.out.println(toplam == sayi ? "Armstrong" : "Not Armstrong");

        int basamakToplam = 0;
        while (sayi != 0) {
            basamakToplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("basamaklarin toplami: " + basamakToplam);
    }
}

// BASAMAK SAYISI BULMA
// 2451 / 10 = 245
// 245 / 10 = 24
// 24 / 10 = 2
// 2 / 10 = 0

// SON BASAMAK BULMA
// 2451 % 10 = 1