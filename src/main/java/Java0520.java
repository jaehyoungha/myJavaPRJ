import java.util.Scanner;

public class Java0520 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        int a = sc.nextInt();

        int gob=1;

        for (int i = 1; i <=a; i++) {
            gob *= i;

            if (i ==0) {
                System.out.println(1);
            }
        }
        System.out.println(gob);
=======

        String a = sc.nextLine();

        String [] arr = a.split("");


        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == "t") {
                System.out.println(i+1+" ");
            }
        }
>>>>>>> origin/master
    }
}
