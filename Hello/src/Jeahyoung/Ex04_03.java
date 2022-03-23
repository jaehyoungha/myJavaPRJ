package Jeahyoung;

public class Ex04_03 {
	public static void main (String[] args) {
		int a = 10;
        // 대입 연산자와 증감 연산자의 종
		
		a++; // a = 11
		System.out.printf(" a ++ ==> %d \n", a);
		
		a--; // a = 10
		System.out.printf(" a -- ==> %d \n", a);
		
		a += 5; // a = 15
		System.out.printf(" a += 5 ==> %d \n", a);
		
		a -= 5; // a = 10
		System.out.printf(" a -= 5 ==> %d \n", a);
		
		a *= 5; // a = 50
		System.out.printf(" a *= 5 ==> %d \n", a);
		
		a /=5; // a = 10
		System.out.printf(" a /= 5 ==> %d \n", a);
		
		a%= 5; // a = 0
		System.out.printf(" a %%= 5 ==> %d \n", a);
	}

}
