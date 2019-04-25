package oct;
import java.io.*;

public class BufferRead {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\HP\\Documents\\MyText.txt"));
		
		char [] c=new char[20];
		bf.read(c, 2, 4);     //(char obj, where to start index array, how many latters read )
		System.out.println(c);
		
		
		
		
		
		/*
		String s;
		while((s=bf.readLine()) !=null)
		System.out.println(s);
		*/
		bf.close();

	}

}
