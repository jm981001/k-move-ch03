package ch03;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 3;
		//int y = 3;
		double result = 0;
		result = x + y;
		System.out.println("두 수의 합: " + result);
		//result = x - y;
		System.out.println("두 수의 차: " + (x-y));
		result = x * y;
		System.out.println("두 수의 곱 : " + result);
		//       강제형변환   자동형변환
		result = (double)x / y;
		System.out.println("두 수의 몫 : " + result);
		result = x % y;
		System.out.println("두 수의 나머지 : " +(x % y));
	}

}
