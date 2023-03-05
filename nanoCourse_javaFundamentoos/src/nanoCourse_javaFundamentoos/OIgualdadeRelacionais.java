package nanoCourse_javaFundamentoos;

public class OIgualdadeRelacionais {

	public static void main(String[] args) {
		
		int idade = 20;
		boolean maioridade = idade > 18; 	// Vendo se a idade é maior que 18
		boolean menoridade = idade > 18; 	// Vendo se a idade é menor que 18
		boolean igualidade = idade == 18;   // Vendo se a idade é igual que 18
		boolean diferenca = idade != 18;	// Vendo se a idade é diferente que 18
		boolean maiorIgual = idade >= 18;	// Vendo se a idade é maior ou igual à 18
		boolean menorIgual = idade <= 18;	// Vendo se a idade é menor ou igual à 18
				
		System.out.println(maioridade);
		System.out.println(igualidade);
		System.out.println(diferenca);
		System.out.println(maiorIgual);
		System.out.println(menorIgual);
		
		// Isso não funciona, por que o PrintLN só consegue imprirmir 1 boolean por vez

	}

}
