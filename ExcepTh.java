package Java_new;

public class ExcepTh {
	

	public static void main(String[] args) throws InterruptedException {
		int x=Integer.parseInt("100");
		System.out.println(x);//no excep
		Thread.sleep(2000);//------------------------>Checked Exception
		System.out.println("Hello");
		Thread.sleep(2000);
		System.out.println("How are you,Rohit...!");
		

	}

}
