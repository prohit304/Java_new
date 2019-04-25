package oct;

import java.io.*;

public class BufferWr {

	public static void main(String[] args) throws IOException{
		 BufferedWriter bf=new BufferedWriter(new FileWriter("C:\\Users\\HP\\Documents\\MyText.txt",true));
		 bf.write("COREJAVA");
		 bf.close();

	}

}
