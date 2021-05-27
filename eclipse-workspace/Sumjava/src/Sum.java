
public class Sum {
	Sum(){System.out.println("hello a");}  
	Sum(int x){  
	this();  
	System.out.println(x);  
	}  
	}  
	class TestThis5{  
	public static void main(String args[]){  
	Sum sum=new Sum(10);  
	}

}
