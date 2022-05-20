import java.util.Scanner;

public class Java0520 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String [] arr = a.split("");


        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == "t") {
                System.out.println(i+1+" ");
            }
        }
    }
}
