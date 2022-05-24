import java.util.Scanner;

public class Java0525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yun = sc.nextInt();

        String yunzu = sc.next();

        String [] arr = yunzu.split("");
        Integer [] arr2 =  new Integer[yunzu.length()];
        for (int i = 0; i <yunzu.length(); i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        int hap =0;
        for (int i = 0; i <arr2.length; i++) {
            hap += arr2[i];
        }
        System.out.println(hap);
    }
}
