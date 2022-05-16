import java.util.Scanner;

public class Java0517 {
    public static void main(String[] args) {
        String[] stack;
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        stack = n.split("");

        for (int i =stack.length-1; i>=0; i--) {
            System.out.printf("%s",stack[i]);
        }
    }
}
