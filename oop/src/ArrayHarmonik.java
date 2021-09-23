public class ArrayHarmonik {
    public static void main(String[] args) {
        double [] numbers = {1, 2, 3, 4, 5};
        double harm = 0;
        for (int i = 0; i < numbers.length; i++) {
            harm += 1 / numbers[i] ;
        }

        System.out.println(numbers.length / harm);
    }
 }
