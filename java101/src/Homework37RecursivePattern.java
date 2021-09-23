class Homework37RecursivePattern {
    static void pattern(int number, int tmp, boolean status) {
        if (number <= tmp) {
            System.out.print(number + " ");
            if (number > 0 && !status)
                pattern(number - 5, tmp, false);
            else
                pattern(number + 5, tmp, true);
        }
    }
    public static void main(String[] args) {
        pattern(16, 16, false);
    }
}
