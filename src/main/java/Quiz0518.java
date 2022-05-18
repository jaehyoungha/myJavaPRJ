import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz0518 {
    public static void main(String[] args) {
        List<Map<String,String>> list = new ArrayList<>();

        Map<String , String > map = new HashMap<>();

        map.put("name", "이협건");
        map.put("dept", "데이터분석");

        list.add(map);

        map = null;

        map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("dept", "정보보안");

        list.add(map);

        map=null;

        List<String> list2 = new ArrayList<>();

        for (String name : list2) {
            System.out.println("name : " + name);
        } // foreach문 하나 끝내고 하나끝내고 하나가 오래걸리면 뒤에서 기다려야함 속도 떨어짐동기식 방식

        list2.forEach(name -> System.out.println("name : "+ name)); // 일단 다 시작하고 끝을 알 수 없음 -> 순서가 바뀔 수 있음 비동기식 방식

    }
}
