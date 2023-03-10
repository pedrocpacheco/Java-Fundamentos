package capitulo5.strings;

public class declararString {
	
	public static void main(String[] args) {
		
		// Existem formas diferentes de criar Strings, a grande diferença é se você
		// Instancia a variavel do tipo String a um objeto String ou não.
		
// Declaração -> Instanciação -> Inicialização (linhas diferentes)
		
		String nome; // Declaramos variavel do tipo String
		nome = new String(); // Instanciamos a variavel a um objeto String
		nome = "Pedro"; // Incializamos a variavel
		System.out.println(nome); // Printiando 
		
// Declaração -> Instanciação -> Inicalização (de forma direta)
		
		String nome2 = new String("Pedro"); // Declarando, Instanciando ao objeto e Incializando
		System.out.println(nome2); // Pritando
		
// Declaração -> Inicialização (Sem Instaciação a um Objeto)
		
		String nome3 = "Pedro";
		System.out.println(nome3);
		
	}
	
}
