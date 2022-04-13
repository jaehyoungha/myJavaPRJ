import java.util.Scanner;

public class Ex06_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("몇 단?");
        int dan = s.nextInt();


        
        for (int i=1; i<10; i++) {
            System.out.println(dan + "X" + i + " = " + dan*i);
        }
    }
}
