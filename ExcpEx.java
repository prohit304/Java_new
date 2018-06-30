package Java_new;

public class ExcpEx {
	
		static void div() throws ArithmeticException
		{
			try {
				int res=100/0;
				System.out.println("Divison is :"+res);
			}catch(ArithmeticException ae) {
				//System.out.println("Divison Unsuccessful");
				throw ae;
			}
		}
		public static void main(String args[]) {
			try {
				div();}
				catch(ArithmeticException ae) {
					System.out.println("Divison Unsuccessful");
			}
		}

	}

	


