import java.util.Scanner;

public class Homework24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName, password;
        int denemeHakki = 3, bakiye = 1500, secim, miktar;

        while (denemeHakki > 0) {

            System.out.print("Kullanıcı Adı:");
            userName = scanner.nextLine();
            System.out.print("Parola: ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                do {
                    System.out.println("1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap\nSecim: ");

                    secim = scanner.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            miktar = scanner.nextInt();
                            bakiye += miktar;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            miktar = scanner.nextInt();
                            if (miktar > bakiye)
                                System.out.println("Bakiye yetersiz.");
                            else
                                bakiye -= miktar;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                    }
                } while (secim != 4);
                break;
            } else {
                denemeHakki--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                System.out.println(denemeHakki == 0 ? "Hesabiniz bloke oldu" : "Kalan Hakkiniz " + denemeHakki);
            }
        }
    }
}
