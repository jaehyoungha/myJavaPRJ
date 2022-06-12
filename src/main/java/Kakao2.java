public class Kakao2 {
    public static void main(String[] args) {
        Kakao2 k = new Kakao2();
        int n = 5;
        int [] arr1 = {9, 20, 28, 18, 1};
        int [] arr2 = {30, 1, 21, 17, 1};
        k.solution(n,arr1,arr2);

    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String[] a = new String[n];

        for (int i = 0; i <n ; i++) {
            String zeroNum = "";
            a[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // 핵심 비트연산
            if (a[i].length() != n) {
                for (int j = 0; j < n - a[i].length(); j++) {
                    zeroNum += "0";
                }
                a[i] = zeroNum + a[i];

            }
            a[i] = a[i].replaceAll("1", "#");
            a[i] = a[i].replaceAll("0", " ");
        }

        for (int i = 0; i <n; i++) {
            System.out.println(a[i]);
        }
        return answer;
    }
}
//  2진수 바꾸는거 toBinaryString
// 비트연산 공부 한 번 하기