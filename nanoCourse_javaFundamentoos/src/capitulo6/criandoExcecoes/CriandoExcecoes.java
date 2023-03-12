package capitulo6.criandoExcecoes;

public class CriandoExcecoes {

	public static void main(String[] args) {
		
	try {	
		
		int val = 10 / 0;
		System.out.println(val);
		
	} catch (ArithmeticException e) {
		
		// Quando rodar o programa sera lançado no console
		throw new DivisaoPorZeroException();
		
	}
	
	}
	
}
