package ch03;

public class Conditional10perationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int score = 75;
        char grade = (score >90)? 'A' : 'B' ; //삼항연산자
        //char grade = (score >90)? 'A' :(score >80)? 'B' : 'C' ; //삼항연산자 중첩
        System.out.println(score +"는"+grade + "입니다");
        
	}

}
