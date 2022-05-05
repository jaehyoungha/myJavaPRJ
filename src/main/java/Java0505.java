import java.util.Scanner;

    public class Java0505 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int arr [] = new int[10];
            int i;
            for (i = 0; i <10; i++) {
                arr [i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int tlqkf;

            sc.close();

            tlqkf = arr[k-1]; //김규린 캐리

            System.out.printf("%d",tlqkf);
        }
    }

