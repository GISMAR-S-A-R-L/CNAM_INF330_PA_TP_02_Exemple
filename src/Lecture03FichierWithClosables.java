import java.io.*;
import java.nio.file.Paths;

public class Lecture03FichierWithClosables {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fileReader = new FileReader(Paths.get("").toAbsolutePath().toString()+"/resources/data.txt");
		BufferedReader reader = new BufferedReader(fileReader);
		try (reader){
			while (reader.ready()) {
				String[] line = reader.readLine().split(" ");
				for (String s : line) {
					System.out.print(s);
				}
				System.out.println();
			}
			// reader.close();
			// fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}