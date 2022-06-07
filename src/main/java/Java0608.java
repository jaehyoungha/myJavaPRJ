import java.util.Scanner;

public class Java0608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String name = sc.next();

        switch (name.substring(n-1)) {
            case "q" :
                System.out.println(1);
                break;
            case "w" :
                System.out.println(1);
                break;
            case "e" :
                System.out.println(1);
                break;
            case "r" :
                System.out.println(1);
                break;
            case "t" :
                System.out.println(1);
                break;
            case "a" :
                System.out.println(1);
                break;
            case "s" :
                System.out.println(1);
                break;
            case "d" :
                System.out.println(1);
                break;
            case "f" :
                System.out.println(1);
                break;
            case "g" :
                System.out.println(1);
                break;
            case "z" :
                System.out.println(1);
                break;
            case "x" :
                System.out.println(1);
                break;
            case "c" :
                System.out.println(1);
                break;
            case "v" :
                System.out.println(1);
                break;
            default:
                System.out.println(0);
                break;
        }
    }
}
