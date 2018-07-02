package Java_new;

import java.util.*;

public class ThrOwnExcp {
	void validate (int age) throws OwnExcp{
		if (age<18)
			throw new OwnExcp();
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Age ");
		int age=in.nextInt();
		try {
			new ThrOwnExcp().validate(age);
			System.out.println("Welcome to voting ");
			System.out.println("Continue to voting operation");
		}catch(OwnExcp ob) {
			System.out.println(ob);//------>or PrintStackTrace(),getMessage,toString
		}

	}

}
