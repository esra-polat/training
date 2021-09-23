import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        System.out.println("--------");

        if (x < y && x < z)
            System.out.println("# " + x);
        else if (y < x && y < z)
            System.out.println("# " + y);
        else
            System.out.println("# " + z);

        if ((x > y && x < z) || (x < y && x > z))
            System.out.println("# " + x);
        else if ((y > x && y < z) || (y < x && y > z))
            System.out.println("# " + y);
        else if ((z > x && z < y) || (z < x && z > y))
            System.out.println("# " + y);

        if (x > y && x > z)
            System.out.print("# " + x);
        else if (y > x && y > z)
            System.out.print("# " + y);
        else
            System.out.print("# " + z);
    }
}
