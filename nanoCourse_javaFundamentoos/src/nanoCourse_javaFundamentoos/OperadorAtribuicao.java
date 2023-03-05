package nanoCourse_javaFundamentoos;

public class OperadorAtribuicao {

	public static void main(String[] args) {
		
		int x = 10;
		x = x + 15; // Estamos atribuindo ao valor x, o seu valor + 15.
		System.out.println(x);
		
		int y = 15;
		y += 15; 	// Outra forma de atribuir um valor a uma variavel 
		System.out.println(y);
		
		int z = 25;
		z *= 2;		// Também podemos utilizar outros operadores como o *
		System.out.println(z);
		
		int c = 50;
		c /= 2;		// E também o /
		System.out.println(c);
		
		
	}

}
