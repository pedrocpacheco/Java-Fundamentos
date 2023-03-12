package capitulo6.cheked;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ThrowsTeste {

	public static void main(String[] args) throws IOException {
		
		// Criando arquivo fw
		FileWriter fw = new FileWriter("c:\\nota.txt"); 
		
		// Criando printador no arquivi fw
		PrintWriter print = new PrintWriter(fw);
		print.println("Pedro");
		print.println("Luane");
		print.println("Maya");
		print.close();
		fw.close();
		
		// Preste atenção que sempre precisamos utilizar os metodos .close
		
	}
	
}
