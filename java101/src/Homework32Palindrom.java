import java.util.Scanner;

public class Homework32Palindrom {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastDigit;
        while (temp != 0){
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber*10) + lastDigit;
            temp /= 10;
        }
        return number == reverseNumber;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPalindrom(scanner.nextInt()) ? "palindrom" : "palindrom degil");;
    }
}
