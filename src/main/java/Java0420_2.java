public class Java0420_2 {
    public static void main(String[] args) {
        int hap = 0;

        for (int i = 50; i <=100; i++) {
          if(i% 3== 0||i%7==0||i%11==0){
              continue;
          }
            hap +=i;
        }
        System.out.printf("%d\n", hap);
    }
}