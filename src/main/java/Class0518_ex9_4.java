public class Class0518_ex9_4 {
    public static void main(String[] args) {
        String str ="Java를 공부하는 중, Java는 재미있어요.^^";

        System.out.println("문자열 ==>" + str);

        System.out.printf("제일 처음에 나오는 Java 위치 ==>");
        System.out.println(str.indexOf("Java"));
        System.out.printf("마지막에 나오는 Java위치 ==>");
        System.out.println(str.lastIndexOf("Java"));
    }
}
