package checkingconstrain;
import java.util.Scanner;
public class classj {
	
	
	public static void main(String args[])
	{
		int numl,num2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		numl=sc.nextInt();
		
		System.out.println("Enter the second number:");
		num2=sc.nextInt();
	
		sc.close();
		sum=numl+num2;
		System.out.println("The sum of two number is" +sum);
	}

	
}
