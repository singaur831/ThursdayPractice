
class Super {

	public int index=2;
}

class App extends Super
{
	public App(int index) 
	{
		index=index;
	}
	
public static void main(String args[])
{
	App myapp= new App(10);	
	System.out.println(myapp.index);
}
}