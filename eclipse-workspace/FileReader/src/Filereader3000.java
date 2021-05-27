import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filereader3000 {

	public static void main(String[] args) throws FileNotFoundException {

		// TODO Auto-generated method stub

		File file= new File("C:\\Study Material\\Splunk 6.X Fundamentals Part 1 (eLearning) (1)\\gaurav.txt");
		Scanner scan=new Scanner(file);
	System.out.println(scan.nextLine());
	}
	

}
