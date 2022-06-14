public class Class0608_ex10_4 {
    public static void main(String[] args) {
        int a = 100, b = 0;
        int result;
        try {
            if (b ==0)
                throw new Exception("0으로 나누려고 ? 어림도 없지ㅋㅋ");
                result = a/b;

        } catch (Exception e) {
            System.out.print("발생오류 ==> ");
            System.out.println(e.getMessage());
        }
    }
}
