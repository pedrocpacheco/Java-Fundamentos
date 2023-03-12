package capitulo6.criandoArquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {
	
	public static void gravarEstoque(String nomeArquivo, String caminho, List<String> conteudo) {
		
		FileWriter stream;
		PrintWriter print;
		
		try {
			
			stream = new FileWriter(caminho); 
			print = new PrintWriter(stream);
			
			for(String linha: conteudo) {
				print.println(linha);
			}
			
			stream.close();
			print.close();
			
		
		} catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		
		String nomeArquivo = "estoque.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "\\" + nomeArquivo; 
		
		List<String> conteudo = new ArrayList<>();
		conteudo.add("Serie; Ator Principal; Temporadas; Nota");
		conteudo.add("The Walking Dead; Andrew Lincoln; 11; 8.7");
		conteudo.add("Prison Break; Wentworth Miller; 5; 8.5");
		conteudo.add("Better Call Saul; Bok Odenkirk; 6; 9.5");
		conteudo.add("Breaking Bad; Bryan Crasnton; 5; 9.2" );
		
		// Criando função que recebe 3 atributos
		gravarEstoque(nomeArquivo, caminho, conteudo);
		
	}
	
}
