import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java0511_2 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();


        map.put("name","이협건");
        map.put("email","hglee67@kopo.ac.kr");
        map.put("addr","서울");
        map.put("dept","데이터분석과");

        list.add(map);

        map=null;

        map = new HashMap<>();
        map.put("name","홍길동");
        map.put("email","g.d.gong@kopo.ac.kr");
        map.put("addr","경기");
        map.put("dept","시각디자인과");

        list.add(map);
        map = null;

        for (int i = 0; i <list.size(); i++) {
            Map rmap = list.get(i);
            System.out.println("name :"+ rmap.get("name"));
            System.out.println("email :"+ rmap.get("email"));
            System.out.println("addr :"+ rmap.get("addr"));
            System.out.println("dept :"+ rmap.get("dept"));
        }
    }

}
