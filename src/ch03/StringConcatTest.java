package ch03;
public class StringConcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "JDK"+ 16.0; 
		String str2 = str1+ "특징";
		System.out.println(str2);
		
		String str3 = "JDK"+ 10 + 6.0;
		String str4 = 10 + 6.0 +"JDK"; //
		System.out.println(str3);
		System.out.println(str4);
			
		
		
	}

}
