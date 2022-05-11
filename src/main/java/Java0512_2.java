import java.util.TreeSet;

public class Java0512_2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("apple");
        ts.add("apple");
        ts.add("core");
        ts.add("banana");

        System.out.println("TreeSet은 값 추가시 정렬로직 지원");
        for (String s : ts){
            System.out.println(s);
        }

        ts.forEach(fruit -> System.out.println("람다식으로 출력 :"+fruit));
    }
}
