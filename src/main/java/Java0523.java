import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Java0523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Float [] arr = new Float[(int) sc.nextFloat()];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextFloat();
        }

        Float hap = Float.valueOf(0);

        Arrays.sort(arr);

        for (int i = 0; i <arr.length; i++) {
            hap += ((arr[i] / arr[arr.length-1]) * 100);
        }
        System.out.println(hap/arr.length);
    }
}
