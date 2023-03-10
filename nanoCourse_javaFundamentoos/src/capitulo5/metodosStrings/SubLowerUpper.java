package capitulo5.metodosStrings;

public class SubLowerUpper {

	public static void main(String[] args) {

		String descricao = new String("Esta é a minha descricao");
		
	// substring: cria uma divisao da String, de um indice a até um indice b
		System.out.println(descricao.substring(5, 15));
		System.out.println(descricao.substring(17));
			// Se não um indice b, ele percorre a String inteira
	
	// usando o substring de forma mais inteligente
		System.out.println(descricao.substring(descricao.indexOf("minha"), descricao.lastIndexOf("descricao")));
		// falamos para o substring começar no primeiro index de minha e terminar no ultimo de descricao
		
	// toLowerCase: deixa o texto selecionado em letra minuscula
		System.out.println(descricao.toLowerCase());
	
	// toUpperCase: deixa o texto selecionado em letra maiscula
		System.out.println(descricao.toUpperCase());
		
			
	}
	
	

}
