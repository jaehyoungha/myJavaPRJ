package Jeahyoung;

public class Ex04_04 extends Ex04_03 {
	public static void main(String[] args) {
		int a = 10, b;
		// 전치 후 연산자 사용 
		// a+1 하기전에 에 먼저 a값을 저장하고,a+1 실행
		b = a++;
		// 메모리는 현재 b = 10 , a = 11인 상태
		System.out.printf("%d \n", b );
		
		b = ++a;
		System.out.printf("%d \n", b );
	    // a = 11인 상태에서 a + 1을 먼저 하고 b에 a 값 저장
	}

}
