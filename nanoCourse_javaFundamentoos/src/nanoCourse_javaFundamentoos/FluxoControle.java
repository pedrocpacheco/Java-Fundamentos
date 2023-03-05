package nanoCourse_javaFundamentoos;

public class FluxoControle {

	public static void main(String[] args) {

		int idade = 15;

		if (idade < 0)
			System.out.println("Idade Invalida");
		// Não precisamos de {} no if caso só tenha 1 linha
		

		if (idade >= 18 && idade <= 70) {
			System.out.println("Maior Idade");
		} else if (idade >= 70){
			System.out.println("Terceira idade");
			if (idade >= 100) {
				System.out.println("E Centanaria");
			}
		} else {
			System.out.println("Menor Idade");
		}


	}

}
