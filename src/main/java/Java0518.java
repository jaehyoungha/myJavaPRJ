import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Java0518 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("케로로");
        list.add("기로로");
        list.add("도로로");
        list.add("쿠루루");
        list.add("타마마");

        for (String name : list) {
            System.out.println("name : " + name);

        }
        System.out.println("---------------------");
        list.forEach(name -> System.out.println("name : " + name));

        System.out.println("----------------------");

        Iterator<String> it = list.listIterator();
        while(it.hasNext()) {
            String name = it.next();
            System.out.println("name : " + name);
        }
    }
}
