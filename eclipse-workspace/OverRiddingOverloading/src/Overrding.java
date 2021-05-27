
public class Overrding {
	
	void run()
	{
		System.out.println("Vehcile is running");
	}

}

class bike extends Overrding
{
	public static void main(String[] args)
	{
		bike obj= new bike();
		obj.run();
	}
}