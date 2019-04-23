package oct;
abstract class Absta{
void calculation(double x) {
	
}
}
class Sum extends Absta{
	void calculation(double x){
		System.out.println("Sum is :"+(x+x));
		
	}
}
class Multiplication{
	void calculation(double x){
		System.out.println("Multiplication :"+(x*x));
		
	}
}
class Sqrt{
	void calculation(double x) {
		System.out.println("Square root :"+Math.sqrt(x));
	}
}
class Main{
	public static void main(String args[]) {
		Sum c=new Sum();
		c.calculation(2);
		Multiplication m=new Multiplication();
		m.calculation(2);
		Sqrt s =new Sqrt();
		s.calculation(54);
	}
}