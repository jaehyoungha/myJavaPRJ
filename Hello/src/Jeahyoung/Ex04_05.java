package Jeahyoung;

public class Ex04_05 extends Ex04_03 {
	public static void main(String [] args) {
		int a = 100, b = 200;
		
		System.out.printf("%d == %d는  %s 이다.\n", a, b, a == b);
		System.out.printf("%d != %d는  %s 이다.\n", a, b, a != b);
		System.out.printf("%d > %d는  %s 이다.\n", a, b, a > b);
		System.out.printf("%d < %d는  %s 이다.\n", a, b, a < b);
		System.out.printf("%d >= %d는  %s 이다.\n", a, b, a >= b);
		System.out.printf("%d <= %d는  %s 이다.\n", a, b, a <= b);
		
		System.out.printf("%d = %d는  %s 이다.\n", a, b, a = b);
	
	}
}
