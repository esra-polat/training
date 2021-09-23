public class Homework31Recursive {
    static int f(int n) {
        System.out.println("n: " + n);
        if (n == 1){
            System.out.println("n-> " + n);
            return 1;
        }
        return f(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(f(6));
    }
}

// f(1) = 1
// f(2) = 1 + 2
// f(3) = 1 + 2 + 3
// f(n) = f(n-1) + n