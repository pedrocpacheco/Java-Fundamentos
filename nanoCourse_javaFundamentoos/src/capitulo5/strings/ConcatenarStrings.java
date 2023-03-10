package capitulo5.strings;

public class ConcatenarStrings {
	
	public static void main(String[] args) {
		
		String nome = new String("Pedro");
		String sobrenome= new String();
		sobrenome = "Pacheco"; // Apenas pra mostrar as formas distintas de criar
		String nomeCompleto;
		
		// Utilizando operador +
		nomeCompleto = nome + " " + sobrenome;
		System.out.println(nomeCompleto);
		
		// Utilizando o metodo .concat
		nomeCompleto = nome.concat(" ").concat(sobrenome);
		System.out.println(nomeCompleto);
		
		// Utilizando o +=
		nomeCompleto = nome += sobrenome;
		System.out.println(nomeCompleto);
		
	}
	
}
