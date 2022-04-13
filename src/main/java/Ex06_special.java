public class Ex06_special {
    public static void main(String[] args) {
        int f = 1;
        int i;

        for (i = 9; i > 0; i--) {
            f *= i;
            System.out.println("중간 계산값 :"+ f);
        }
        System.out.println("5부터 1까지 곱한 값 :"+ f);
    }
}
