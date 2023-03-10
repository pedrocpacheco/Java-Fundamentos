package capitulo5.metodosStrings;

public class Comparacao {

	public static void main(String[] args) {
		String nome = new String("pedro");
		String nome2 = new String("Pedro");
		String nome3 = new String("pedro");
		
	// equals: Compara a igualdade
		System.out.println(nome.equals(nome2));
		// Falso, pois pedro != Pedro
	
	// equalsIgnoreCase: compara igualdade, ignora letra maiuscula
		System.out.println(nome.equalsIgnoreCase(nome2));
		// True, pois pedro = Pedro (ignorando os maisculos)
	
	// ==: ele não só compara o texto, como a posição delas na memoria
		boolean teste = (nome == nome3);
		System.out.println(teste);
		// False: Como ambos são objetos, eles tem local especifico 
		// na memoria alocado então, mesmo com valor igual.
		
	// ==: sem instanciar objetos
		// Vamos definir variveis Strings sem instancia-las a um objeto String
		String sobrenome = "Pacheco";
		String sobrenome2 = "Pacheco";
		
		teste = (sobrenome == sobrenome2);
		System.out.println(teste);
		// True: como elas não estão instanciada a objetos, as duas variaveis
		// estão em um pull de memoria, estão no mesmo endereço de memoria
	}
	
}
