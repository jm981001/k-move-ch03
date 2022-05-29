package ch03;
public class IncreaseDecreaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x= 10, y =10;
        int z ;
        
        System.out.println("-----------------");
        x++;
        ++x;
        System.out.println("x= "+ x);
         
        System.out.println("-----------------");
        y--;
        --y;
        System.out.println("y= "+ y);
       
        System.out.println("-----------------");
       z= x++;
       System.out.println("z= "+ z);
       System.out.println("x= "+ x);
       
       System.out.println("-----------------");
       z= ++x;
       System.out.println("z= "+ z);
       System.out.println("x= "+ x);
       
       System.out.println("-----------------");
       z= ++x +y++;
       System.out.println("z= "+ z);
       System.out.println("x= "+ x);
       System.out.println("y= "+ y);
       


	}

}
