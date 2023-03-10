package capitulo5.estruturasRepeticao;

public class While {
	
	public static void main(String[] args) {
		
		int produtosRegistrados = 0;
		int totalProdutos = 5;

		// Enquanto (true)
		while (produtosRegistrados < totalProdutos){
			// Faça
			produtosRegistrados++;
			System.out.println("O Produto de numero" + produtosRegistrados + "foi registrado");
		}
	}
}
