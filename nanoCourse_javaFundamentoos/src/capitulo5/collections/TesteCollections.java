package capitulo5.collections;

import java.util.ArrayList;

public class TesteCollections {

	public static void main(String[] args) {
		
		// Variavel de tipo Array List -> Instanciada
		ArrayList carrinho = new ArrayList();
		double valor = 100.55;
		int valor2 = 1; 
		int valor3; // receberá o valor de um indice no futuro
		
		// Adicionando de forma dinamica a uma lista
		carrinho.add(valor);
		carrinho.add("Texto");
		carrinho.add(valor2);
		
		// .get pega o valor que esta no indice x da lista
		System.out.println(carrinho.get(1));
			// Texto
		
		// Tentando passar o indice "que é um numero" para uma variavel int
		valor3 = (int) carrinho.get(2); // o valor do indice 2 é 1
				 // o indice trazido pelo .get precisa passar pelo cast de int para ser atribuido
				 // originalmente é um objeto
	}
	
}

