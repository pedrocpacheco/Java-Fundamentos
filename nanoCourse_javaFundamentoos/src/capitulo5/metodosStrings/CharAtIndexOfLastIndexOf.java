package capitulo5.metodosStrings;

public class CharAtIndexOfLastIndexOf {

	public static void main(String[] args) {
		
		String descricao = new String("Esta é a minha descricao");
		
	// chatAt: devolve a palavra em determinado index
		System.out.println(descricao.charAt(0)); // Letra: E
	
	// indexOf: devolve o index de determinado caractere 
		System.out.println(descricao.indexOf("d"));
		System.out.println(descricao.indexOf("descricao"));
			//Podemos colocar palavra, mas ele devolve o index da 1 letra
		
	// lastIndexOf: devolve o index do ultimo uso de determinado caracter
		System.out.println(descricao.indexOf("o"));
		
	}
	
}
