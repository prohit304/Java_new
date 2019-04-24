package oct;
import java.util.Scanner;
public class Book {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter How many Books :");
		int books=sc.nextInt();
		
		int marks[]=new int[books];
		
		for(int i=0;i<books;i++) {
			System.out.print("Enter marks :");
			marks[i]=sc.nextInt();
			
		}
		int total=0;
		
		for(int i=0;i<books;i++) {
			total +=marks[i];
			
		
		}
		float percantage = (float)total/books;
		System.out.println("Total marks :"+total);
		System.out.println("Percentage % :"+percantage);
		

	}

}
