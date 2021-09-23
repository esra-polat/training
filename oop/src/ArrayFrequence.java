import java.util.Arrays;

public class ArrayFrequence {
    static int counter(int[] arr, int val){
        int res = 0;
        for(int i:arr)
            if(i==val)
                res++;
        System.out.println(val + " " + res + " defa gecti");
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,10,5,7,30,10,4,7,10};
        Arrays.sort(arr);
        for (int i:arr){
            counter(arr,i);
        }
    }
}
