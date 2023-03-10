package capitulo5.arrays.arraysDeObjetos;

public class Caixa {
	
	public static void main(String[] args) {
		// Criando nosso Array
		Produto[] produtos = new Produto[2]; 
	// Produto[] produtos = new Produto[] {prod1, prod2}; | não da para fazer, prod1 e prod2 ainda não existem
		
		// Criando objeto 1 
		Produto prod1 = new Produto();
		prod1.setNome("Papel");
		prod1.setDescricao("Uma folha de papel");
		prod1.setValor(19.5f);
		
		// Criando objeto 2
		Produto prod2 = new Produto();
		prod2.setNome("Tesoura");
		prod2.setDescricao("Ela corta");
		prod2.setValor(10.4f);
		
		// Instanciando nossos objetos para a Array
		produtos[0] = prod1; // prod1 no indice 0
		produtos[1] = prod2; // prod2 no indice 1
		
		// Imprimindo todas as informações dos objetos do Array
		
		//Utilizando for loop
		for(int i = 0; i < produtos.length; i++) { // Usamos produtos.length para passar por todos os itens
			System.out.println(produtos[i].toString()); // Utilizamos o metodo toString para passar um objeto para String
		} // Não precisamos utilizar o for loop pela produtos.length, e sim usar o forEach das arrays
		
		// Utilizando metodo foreach
		for(Produto prod: produtos) { // Criamos uma variavel que armazena cada item
			System.out.println(prod.toString());
		}
	
		// O Array poderia ser criado depois dos atributos
	// Produto[] produtos = new Produto[] {prod1, prod2};
		// Assim, já poderiamso preencher as posições do Array com prod1 e prod2
	
		
	}
	
}
