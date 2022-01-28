package fr.cnam;

import java.io.*;

public class Lecture04FichierUsingInputStream {
	public static void main(String[] args) throws FileNotFoundException {
		// Streaming d'une ressource du classpath
		InputStream stream = Lecture04FichierUsingInputStream.class.getResourceAsStream("../../data.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		try (reader){
			while (reader.ready()) {
				String[] line = reader.readLine().split(" ");
				for (String s : line) {
					// impression des mots séparés par '|'
					System.out.print(s + "|");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}