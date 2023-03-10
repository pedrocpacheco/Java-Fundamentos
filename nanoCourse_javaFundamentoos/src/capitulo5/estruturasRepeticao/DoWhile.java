package capitulo5.estruturasRepeticao;

public class DoWhile {

	public static void main(String[] args) {
		
		int produtosRegistrados = 0;
		int totalProdutos = 5;
		
		//Faça 
		do {
			produtosRegistrados++;
			System.out.println("O caixa registrou o produto" + produtosRegistrados);
			
		  // Enquanto (true)	
		} while(produtosRegistrados <= totalProdutos);

	}

}
