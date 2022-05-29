package ch03;


public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A'; //문자를 직접 저장
		char c2 = 65; //10진수로 저장
		char c3 = 'a'; //문자를 직접 저장
		char c4 = '가'; //문자를 직접 저장
				
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println((int)c3);
		System.out.println((char)((int)c3+1));
		System.out.println(c4);
		System.out.println((int)c4);
		System.out.println((char)((int)c4+1));
	}

}
