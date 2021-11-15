import java.io.*;

public class Lecture01Clavier {
	public static void main(String[] args) {
		try {
			// Input
			Reader in = new InputStreamReader(System.in);
			// Reader
			BufferedReader flux = new BufferedReader(in);
			System.out.print("Entrez votre prenom : ");
			String prenom = flux.readLine();

			System.out.println("Bonjour " + prenom);
			flux.close();
		} catch (IOException ioe) {
			System.err.println(ioe);
		}
	}
}