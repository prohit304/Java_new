package rohit;

import java.io.*;

public class Pallidrome
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String :- ");
		String str=br.readLine();
		String temp=str;
		StringBuff sb=new StringBuff(str);
		sb.reverse();
		str=sb.toString();
		if(temp.equalsIgnoreCase(str))
		System.out.println(temp+" is a pallodrome");
		else
		 System.out.println(temp+" Is not a Pallodrome");
	 }
 }