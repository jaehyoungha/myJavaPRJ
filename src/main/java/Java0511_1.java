import java.util.ArrayList;
import java.util.List;

public class Java0511_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("케로로");
        list.add("도로로");
        list.add("기로로");
        list.add("타마마");
        list.add("쿠루루");

        list.forEach(name -> System.out.println("이름 :" + name));
    }
}
