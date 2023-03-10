package capitulo5.metodosStrings;

public class LengthStartsEnds {

	public static void main(String[] args) {

		String descricao = new String ("Essa é a minha descrição");
		
	// length: Devolve a quantidade de caracters da String
		System.out.println(descricao.length());
	
	// startsWith: Vê se ela inicia com tal expressão // boolean
		System.out.println(descricao.startsWith("Essa"));
	
	// endsWith: Vê se ela termina com tal expressão // boolean
		System.out.println(descricao.endsWith("descrição"));
		
	}

}
