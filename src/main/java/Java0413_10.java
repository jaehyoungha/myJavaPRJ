public class Java0413_10 {
    public static void main(String[] args) {
        int a = 0;
            for (int i=0; i< 101; i++){
                if ((a %3==0) || (a%5==0)) {
                    a += i;
            }
        }
        System.out.printf("1부터 100까지 3또는 5의 배수를 더한 값: %d\n", a);

    }
}
