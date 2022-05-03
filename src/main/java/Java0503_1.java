import java.util.ArrayList;
import java.util.List;

public class Java0503_1 {
    public static void main (String [] args) {

        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        list.forEach(name -> System.out.println("name :" + name));


    }
}
