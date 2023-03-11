package capitulo6.excessoes;

public class TestException {
	public static void main(String[] args) {
		
		// inicia um codigo que pode acontecer exceção
		try {
			
			// Bloco onde exceção pode ocorrer
			int valor = 10 / 0;
			System.out.println(valor);
			
		} catch (Exception e) { // Captura da exceção
			
			// tratando exceção
			System.out.println("Não é possivel dividir por 0");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	}
}
