import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Lecture02FichierText {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader(Paths.get("").toAbsolutePath().toString()+"/resources/data.txt");
			BufferedReader reader = new BufferedReader(fileReader);
			while (reader.ready()) {
				String[] line = reader.readLine().split(" ");
				for (String s : line) {
					System.out.print(s);
				}
				System.out.println();
			}
			reader.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}