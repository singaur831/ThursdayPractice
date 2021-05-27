package Conversion;

public class Conversion1 {
public static void main(String args[])

{
	try
	{
		int a[]= new int[10];
		System.out.println(a[15]);
	}catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Arrayindexout of bounds");
    }
	catch(NullPointerException e)
	{
		System.out.println("null pointer expection");
	}
System.out.println("rest id the code..");	
}
   
}
