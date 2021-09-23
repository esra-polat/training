public class Homework36RecursivePrime {
    static boolean isPrime(int n, int i) {
        if (n == i) return true;
        else if (n % i == 0) return false;
        else return isPrime(n, ++i);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(22,2));
    }
}
