import java.util.Scanner;

class Main
{
    public static void Java0426 (String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++) {
                System.out.printf(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.printf("*");
            }System.out.println();
        }

        for(int i=1; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.printf(" ");
            }
            for(int j=0; j<n-i; j++) {
                System.out.printf("*");
            }System.out.println();
        }
    }
}