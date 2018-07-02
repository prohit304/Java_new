package Java_new;

public class OwnExcp extends RuntimeException 

	{
		String msg;
		public OwnExcp() {
			this.msg="Invalid Age,\n Age must be 18 yr  ";
		}
		//override
		public String toString(){
			return msg;
		}
		
		

	}


