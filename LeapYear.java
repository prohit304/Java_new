package rohit;
import java.io.*;
public class LeapYear {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Year : ");
		int year=Integer.parseInt(br.readLine());
		
		if
		(year%100==0 && year%400==0)
			System.out.println(year+" It's Leap");
		else if
		(year%100 !=0 && year%4==0)
			System.out.println(year+" It's Leap");
		else
			System.out.println(year+" It's not leap");
	}

}
