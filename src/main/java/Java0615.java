public class Java0615 {
    public static void main(String[] args) {
        int a = 100,b=0;
        int result;
        try {
            if (b==0){
                throw new Exception("nope");
            }
            result = a/b;
        } catch (Exception e) {
            System.out.println("발생오류 => "+ e.getMessage());
        }
    }
}
