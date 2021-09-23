public class Homework29 {
    public static void main(String[] args) {
        int n;
        for (int i = 2; i <= 100; i++) {
            n = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) n++;
            }
            if (n == 0) System.out.print(+i + " ");
        }
    }
}

