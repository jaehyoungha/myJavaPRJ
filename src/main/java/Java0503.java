import java.util.HashSet;
import java.util.Scanner;

public class Java0503 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                HashSet<Integer> q = new HashSet<Integer>();

                for (int i = 0; i <10; i++) {
                    q.add(sc.nextInt()%42);
                }
                sc.close();
                System.out.print(q.size());
            }


        }

