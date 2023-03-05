package nanoCourse_javaFundamentoos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		int z = 15;	
		
		int result = x + y;
		System.out.println(result);
		
		// Não precisa de INT para mudar o valor 
		
		result = x - y;
		System.out.println(result);
		
		result = x * y;
		System.out.println(result);
		
		result = x / y;
		System.out.println(result);
		
		result = x % y;
		System.out.println(result);
		
		// Usando ()
		result = z - x + (y * x) / z;
		System.out.println(result);

	}

}
