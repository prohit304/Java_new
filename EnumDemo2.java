package Java_new;

public class EnumDemo2 {

	enum Day{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}
	public static void main(String[] args) {
		
		Day yesterday=Day.MONDAY;
		Day today=Day.SUNDAY;
		Day tomorrow=Day.MONDAY;
		
		
		
		System.out.println("Today is :"+today);
		System.out.println("Tomorrow is :"+tomorrow);
		System.out.println("Yesterday is :"+yesterday);		

	}

}
