import java.util.Scanner;

public class Homework9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("12345")) {
            System.out.println("giris basarili");
        } else {
            System.out.println("giris basarisiz");
            System.out.println("sifrenizi sifirlamak ister misiniz? (evet/hayir)");
            String answer = scanner.nextLine();
            if (answer.equals("evet")){
                System.out.print("yeni sifrenizi giriniz: ");
                String newPass = scanner.nextLine();
                if (newPass.equals(password) || newPass.equals("12345"))
                    System.out.println("sifre olusturulamadi lutfen baska sifre deneyin");
                else
                    System.out.println("sifre olusturuldu");
            }
        }


    }
}