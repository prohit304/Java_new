package oct;

import java.util.Scanner;
public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Subjects :");
		int sub=sc.nextInt();
		
		int [] marks=new int [sub];
		
		
		for(int i=0;i<sub;i++) {
			System.out.println("Enter Marks :");
			 marks[i]=sc.nextInt();
		}
		int total=0;
		for(int i=0;i<sub;i++) {
			total += marks[i];
			
			
			System.out.println("Total marks :"+total);
		}
		

	}

}
