package capitulo5.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteCollectionsBP {

	public static void main(String[] args) {
		
// Declaramos variavel do tipo List (interface) e instanciamos ela a um objeto ArrayList
	List<String> carrinho = new ArrayList<String>(); //<Generics>
								// Definimos que esse array list só será de Strings

// .isEmpty: metodo que retorna se a ArrayList esta ou não vazia
	System.out.println(carrinho.isEmpty()); 

// .add: ja vimos, ele serve para adicionar itens dinamicamente na nossa Array
	carrinho.add("Pedro");
	carrinho.add("Luane");

// .set: troca um valor de um indice ja existente para outro .add(indice, "novoValor");
	carrinho.set(1, "Pacheco");
	
	// .isEmpty depois de adicionar itens
	System.out.println(carrinho.isEmpty());
		// False
	
// .size: retorna o tamanho da ArrayList
	System.out.println(carrinho.size());
	
// .contains: retorna se contem elemento no array
	System.out.println(carrinho.contains("Carvalho"));
		// False
	
	}
}

