package Java_new;

public class EnumDemo4 {

	enum Day{
		MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7),;
	
	private int val;
	
	private Day(int val) {
		this.val=val;
	}
	
	}
	
	public static void main(String args[]) {
		Day today=Day.SUNDAY;
		System.out.println(today+""+today.val);
		
		for(Day d:Day.values()) {
			System.out.println(d+"\t"+d.val+"\t"+d.ordinal());
			switch(d) {
			
			case MONDAY:
				System.out.println("week begins");
			    break;
			
			case FRIDAY:
				System.out.println("Weekend Begins");
				break;
				
			case SUNDAY:
				System.out.println("Week ends");
				break;
			}
		}
	}
}
