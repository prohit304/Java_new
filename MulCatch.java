package Java_new;
import java.util.*;
public class MulCatch {

	public static void main(String[] args) {
		int x,y,res;
		Scanner in=new Scanner(System.in);
		try {
			System.out.println("Enter X & Y values");
			x=in.nextInt();
			y=in.nextInt();
			res=x/y;
			System.out.println("Results is :"+res);
			//catch(Excp1 | Excp2 |Excp3 ref)
		}catch(InputMismatchException | ArithmeticException a) {
			System.out.println(a+"\n plz try again");
			
		}
		

	}

}
