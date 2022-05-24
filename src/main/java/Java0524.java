import java.util.*;

public class Java0524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int n = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            set.add(sc.nextInt());
        }
        List list = new ArrayList(set);

        Collections.sort(list);

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
