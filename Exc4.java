
public class Exc4 {
	
	
		static void m1() 
		{
			try {
				int res=100/25;
				System.out.println("Divison is :"+res);
			}catch(ArithmeticException ae) {
				throw ae;
			}
		}
			public static void main(String args[]) {
				try {
					m1();
				}catch(ArithmeticException a) {
					System.out.println("Divison Not Possible");
				}
			}	
}