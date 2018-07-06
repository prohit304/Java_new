package Java_new;

import java.io.PrintStream;
public class String_Demo2 {

	public static void main(String[] args) {
		
		PrintStream ps=new PrintStream(System.out);
		String st1="Dolby Home Theater";
		ps.println("String :" +st1);
		
		/*length()
		 * public int length()*/
		int l=st1.length(); //------->st1 is correct Calling obj
		ps.println("Length :"+l);
		ps.println("Mangos :".length()); //--------->Finding number of characters availble
		
		/*toUpperCase()
		 * public String toUpperCase()
		 * 
		 * toLowerCase()
		 *  public String toLowerCase()*/
		
		String x=st1.toUpperCase();
		ps.println("st1 :"+st1);
		ps.println("Uppercase"+x);
		ps.println("LowerCase"+st1.toLowerCase());
		
		/*concate()
		 * public string concate (String str2)
		 */
		
		String y="-HP";
		x=st1.concat(y);//----------->x=st1+y
		ps.println("Concat String :"+x);
		
		/*charAt()
		 * public char charAt(int index)throws SIOOBE*/
		char ch=st1.charAt(12);
		ps.println("char@7 :"+ch);
		try{
			ps.println("char@25"+st1.charAt(25)) ;
		}catch(StringIndexOutOfBoundsException s) {
			ps.println(s);
		}
		
	/*indexOf()
	 * lastIndexOf()*/
		
		int pos=st1.indexOf('o');
		ps.println(st1);
		ps.println("1st O @ :"+pos);
		ps.println("the @ :"+st1.indexOf("The"));
		ps.println("e @"+st1.indexOf('e'));
		ps.println("e @"+st1.indexOf('e', 10));
		
		ps.println("z@ :"+st1.indexOf('z'));
		ps.println("last o @"+st1.lastIndexOf('o'));
		
		/*replace
		 * public string replace(String search-str,String rep-str)*/
		
		ps.println("String replace :"+st1.replace('e','$'));
		ps.println(st1);
		
		/*subString
		 * public String subString(int st-index) throws SIOOBE
		 * public String subString(int st-index,int end-index) throws SIOOBE*/
		ps.println("SubString :"+st1.substring(6));
		ps.println("Substring :"+st1.substring(3,10));
		
		/*getBytes
		 * public byte[] getBytes()*/
		
		byte b[]=st1.getBytes();
		for(byte t:b) 
			ps.println(t+"");
		ps.println();
		
		/*toCharArray()
		 * public char[] toCharArray()*/
		char c []=st1.toCharArray();
		for(char t:c)
			ps.printf("%3c",t);
		//or ps.println(c+"\n");
		
		/*replaceAll
		 * public String replaceAll(String Pattren,String rep-String)*/
		
		String a="(123)456*bbcSTAR#$";
		ps.println("\n"+a);
		ps.println(a.replaceAll("[0-9]", "0"));
		ps.println(a.replaceAll("[0-9]", ""));
		ps.println(a.replaceAll("[^0-9]", ""));
		ps.println(a.replaceAll("[STAR]","_"));
		ps.println(a.replaceAll("[a-z]", "-"));
		ps.println(a.replaceAll("[()#*$]", ""));
		
		/*Spilt
		 * public String [] spilt(String delim)*/
		
		String name="P,Rohit,Kumar.prk";
		String words[]=name.split(",");
		for(String t:words)
			ps.println(t);
			
		
		
		
		

	}

}
