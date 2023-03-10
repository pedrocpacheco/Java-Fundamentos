package capitulo5.estruturasRepeticao;

public class For {
	
	public static void main(String[] args) {
		
		int totalProdutos = 5;
			//      1                   // Pois o incrimento só vem depois da repetição
		for(int i = 0; i < totalProdutos; i++){
			// se o construtor começar em 0, o primeiro print será com valor 0
			System.out.println("O produto" + i + "foi registrado");
		}
		
	}
}
