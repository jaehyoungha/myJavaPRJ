public class Java0512_5 {
    public static void main(String[] args) {
        int [][] arr = new int[9][9];

        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; j <arr.length; j++) {
                arr[i][j] = i*j;
                System.out.printf("%d * %d = %d\n", i , j ,arr[i][j]);
            }
            System.out.println();
        }
    }
}
