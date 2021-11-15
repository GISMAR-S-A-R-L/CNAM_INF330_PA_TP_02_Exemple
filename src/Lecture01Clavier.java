import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecture01Clavier {
	public static void main(String[] args) {
		try {
			BufferedReader flux = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.print("Entrez votre prenom : ");
			String prenom = flux.readLine();
			System.out.println("Bonjour " + prenom);
			flux.close();
		} catch (IOException ioe) {
			System.err.println(ioe);
		}
	}
}