package capitulo6.modificadores;

public class staticFinal {
	
	public static final int banco = 33;
	
	// final diz que é constante
	// static passa o atributo a todas as instancias
	// public sempre precisa estar em constantes

	public static void main(String[] args) {
		
		staticFinal teste = new staticFinal();
		
		// / nao pode ser mudado por ser constante 
		// teste.banco = 33;
		
		System.out.println(staticFinal.banco);
		// quando queremos mexer com algo staticFinal preciamos colocar
		// o nome da classe .staticFinal e nao o nome do objeto

		
	}
	
}


