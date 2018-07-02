package Java_new;
//Example on try-with-resource statement
import java.io.*;
public class ExceDemo {
	public static void main(String[] args) throws IOException {
		
		try(FileInputStream f=new FileInputStream("Demo5.java"))
		//try (Excepname ref=new ExcepName(filename/resourse)
		{
			int c;
			while((c=f.read())!=-1) {
				System.out.println((char)c);
			}
			//File closed
		}
		System.out.println("Done....!");

	}

}
