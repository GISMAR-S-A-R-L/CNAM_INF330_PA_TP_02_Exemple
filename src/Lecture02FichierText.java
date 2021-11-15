import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Lecture02FichierText {
	public static void main(String[] args) {
		try {
			String currentDir = Paths.get("").toAbsolutePath().toString();
			String textFileName = currentDir + "/resources/data.txt";
			// Reading text file
			FileReader fileReader = new FileReader(textFileName);
			// Buffering text stream
			BufferedReader reader = new BufferedReader(fileReader);
			while (reader.ready()) {
				String[] line = reader.readLine().split(" ");
				for (String s : line) {
					// impression des mots séparés par '|'
					System.out.print(s + "|");
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