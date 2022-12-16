package files;
import java.io.*;
import java.util.*;
public class ReadingFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myfile=new File("reg.txt");
		Scanner scan=new Scanner(myfile);
		while (scan.hasNextLine())
		{
			String data=scan.nextLine();
			System.out.println(data);
		}
		System.out.println("reading complete");
		scan.close();
	}

}