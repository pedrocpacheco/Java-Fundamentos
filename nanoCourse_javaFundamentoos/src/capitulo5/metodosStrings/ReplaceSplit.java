package capitulo5.metodosStrings;

import java.util.Arrays;

public class ReplaceSplit {

	public static void main(String[] args) {
		
		String descricao = new String("Cyberpunk é o jogo legal");
		
	// Replace: Troca determinado caractere ou palavra, por outro.
		System.out.println(descricao.replace("é", "É"));
		System.out.println(descricao.replace("Cyberpunk", "GTA"));
		System.out.println(descricao.replace("o", "um"));
		
	// Split: Divide a string com um separador determinado
		System.out.println(descricao.split(" ").length);
			// Aqui usamos o .length para ver quantos divisões tivemos
		System.out.println(Arrays.toString(descricao.split("")));
	
	}
	
}
