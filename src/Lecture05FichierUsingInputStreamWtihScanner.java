import java.io.*;
import java.util.Scanner;

public class Lecture05FichierUsingInputStreamWtihScanner {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream stream = Lecture05FichierUsingInputStreamWtihScanner.class.getResourceAsStream("data.txt");
		Scanner scanner = new Scanner(stream);
		try (scanner){
			while (scanner.hasNext()) {
				String s = scanner.next();
				System.out.println(String.format("s:%s - ",s));
			}
		}
	}
}