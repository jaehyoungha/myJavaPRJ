class Myparent {
    public int cal (int num1,int num2) {
        return num1 + num2;
    }
}
public class Test_1 extends Myparent {
    public int cal (int num1,int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Test_1 c = new Test_1();
       //int result = c.cal(2,3);
       // System.out.println("2 * 3 = "+result);
        System.out.println(c.cal(2,3));
    }
}
