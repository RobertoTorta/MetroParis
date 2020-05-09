package polito.it.progettoTesiTriennale.csvReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

	public static void leggiIlFile( String nomeFile) {
		String fileName = nomeFile;
		File file = new File(fileName);
		try {
			Scanner inputStream = new Scanner(file);
			inputStream.next();
			while(inputStream.hasNext()) {
				String data = inputStream.next();
				System.out.println(data);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {

		leggiIlFile("dpc-covid19-ita-andamento-nazionale.csv");
		
		
		

	}

}
