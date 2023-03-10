package capitulo4;

// NomeSubClasse extends NomeClassePai
public class Cachorro extends Animal {

	// Nos não precisamos reescrever os atributos e metodos de Animal
	/*
	 * String locomve;
	 * String alimentar;
	 */
	
	// Apenas precisamos escrever os Atributos especificos
	private String latido;
	
	// Não precisamos reecrever os getters e setters dos atributos de animal
	
	// So os especificos dos atributos de Cachorro
	public String getLatido() {
		return latido;
	}

	public void setLatido(String latido) {
		this.latido = latido;
	}
	
	
	
}
