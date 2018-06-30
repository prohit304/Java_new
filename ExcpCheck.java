package Java_new;
import java.io.*;
public class ExcpCheck {
	
	void validate(int age) throws IOException{
		if(age<18)
			throw new IOException();
			else 
				System.out.println("Welcome to vote");
	}

	public static void main(String[] args) {
		try {
			ExcpCheck ec=new ExcpCheck();
			ec.validate(4);
		}catch(IOException io) {
			System.out.println("Wrong Age");
		}

	}

}
