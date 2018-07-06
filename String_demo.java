package Java_new;

public class String_demo {

	public static void main(String[] args) {
		
		String st1="Rohit";
		String st2=new String ("Eclipse");
		String st3=new String (st2);
		char ch[] = {'P','R','O','H','I','T','K','U','M','A','R'};

		String st4=new String(ch);
		String st5=new String (ch,2,5);           //(array name,where to start,where to end)
		int a[]= {65,66,67,68,69,70,71};
		String st6=new String (a,0,7);
		String st7=new String ();
		//String st8; CTE
		System.out.println("St1"+st1);
		System.out.println("St2"+st2);
		System.out.println("St3"+st3);
		System.out.println("St4"+st4);
		System.out.println("St5"+st5);
		System.out.println("St6"+st6);
		System.out.println("St7"+st7);
		//String st8 cant be called Its CTE
	}

}
