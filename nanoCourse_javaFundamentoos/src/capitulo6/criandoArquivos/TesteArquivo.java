package capitulo6.criandoArquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {
	
	public static void informacoesArquivo(String caminho) {
		
		// Criando arquivo
		File arquivo = new File(caminho);
		
		if(arquivo.exists()) {
			System.out.println("O arquivo existe!" + 
					"\nPode ser lido: " + arquivo.canRead() + 
					"\nPode ser gravado:" + arquivo.canWrite() +
					"\nTamanho: " + arquivo.length() +
					"\nCaminho: " + arquivo.getPath()); 
		} else {
			try {
				if(arquivo.createNewFile()) {
					System.out.println("Arquivo Criado!");
				} else {
					System.out.println("Arquivo não criado!");
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void gravarEstoque(String nomeArquivo, String caminho, List<String> conteudo) {
		
		// Criando variaveis do tipo File Writer e PrintWriter (classes)
		FileWriter stream;
		PrintWriter print;
		
		try {
			
			// atribuindo variaveis a objetos da mesma classe do tipo da variavel
			stream = new FileWriter(caminho); // criando o arquivo com o nome definido anteriomente
			print = new PrintWriter(stream); // passando o arquivo onde iremos printar

			// Fazendo um foreach por todos os Arrays da nossa lista de Arrays
			for(String linha: conteudo) {
				print.println(linha);
			}
			
			// Fechando os objetos
			stream.close();
			print.close();
			
		  // Printando um erro IOException caso erro no local de arquivo
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("Seu arquivo " + nomeArquivo + "foi gerado em " + caminho);
		
	}

	public static void lerArquivo(String caminho) {
		try {
			
			// Abre o arquivo para a leitura
			FileReader stream = new FileReader(caminho);
			
			// Passamos o arquivo para leitura a um objeto capaz de lelo
			BufferedReader reader = new BufferedReader(stream);
			
			// Criando o leitor de uma linha do arquivo para leitura
			String linha = reader.readLine(); // lendo uma linha
			
			// Lendo todas as linhas atraves de uma estrutura de repeteicao
			while (linha != null) { // o valor de linha só será null quando a linha não tiver conteudo
				
				System.out.println(linha); // le a linha atual
				linha = reader.readLine(); // passando para a proxima linha
			
			}
			
			reader.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		// Criando caminho para o arquivo
		String nomeArquivo = "estoque2.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "\\" + nomeArquivo; 
		
		// Criando uma lista de arrays com o conteudo do nosso arquivo
		List<String> conteudo = new ArrayList<>();
		conteudo.add("Serie; Ator Principal; Temporadas; Nota");
		conteudo.add("The Walking Dead; Andrew Lincoln; 11; 8.7");
		conteudo.add("Prison Break; Wentworth Miller; 5; 8.5");
		conteudo.add("Better Call Saul; Bok Odenkirk; 6; 9.5");
		conteudo.add("Breaking Bad; Bryan Crasnton; 5; 9.2" );
		
		// Criando função que recebe 3 atributos
		gravarEstoque(nomeArquivo, caminho, conteudo);
		// lerArquivo(caminho);
		informacoesArquivo(caminho);
		
	}
	
}
