package nanoCourse_javaFundamentoos;

public class Conversoes {

	public static void main(String[] args) {
		
		// Estamos convertendo o valor de um int para outros tipos de variaveis
		// Nos casos a seguir, vimos que podemos fazer isso sem perder nenhum dado
		
		int x = 10;	 	// declarando valor de uma variavel int
		double d = x;	// variavel double recebe um valor de tipo int
		long l = x; 	// variavel long recebe um valor de tipo int
		float f = x;	// variavel float recebe valor de um tipo int
		short s = 20;	// variavel short recebe valor de um tipo int	
		
		System.out.println(x + d + l + f + s);

		// Aqui estamos passando um valor double para int
		// Vemos que nesse caso, vamos perder dados com a Conversão
		
		double valorDouble = 9.99;
//		int valorInt = valorDouble; 		// A IDE diz que estamos perdendo dados, então ocorre um erro
		int valorInt = (int) valorDouble;	// Então, precisamos forçar a conversãoatravés do (int), mas perdemos dados.
		
		System.out.println(valorInt); 		// Resultado será 9 e nao 9.99, pois INT não armazena tudo do DOUBLE
		
	}

}
