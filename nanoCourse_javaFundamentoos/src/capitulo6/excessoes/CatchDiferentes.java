package capitulo6.excessoes;

public class CatchDiferentes {

	public static void main(String[] args) {
		
		try {
			
			int val = 10 / 0; // Exceção Aritmetica
			
			int[] valores = new int[3];
			System.out.println(valores[4]); // Array Exeption
				// Estamos tentando acessar um index 5 de um array com 3 itens

			String nome = null;
			System.out.println(nome.length());
				// Estamos tentando acessar a uma variavel nao inicializado
			
			int numero = Integer.parseInt("zero");
				// Estamos passando um texto para int
			
		} catch(ArithmeticException e) {
			
			System.out.println("Não é possivel dividir por 0");
			
		
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Esse index esta fora do tamanho da array");
	
			
		} catch(NullPointerException e) {
			
			System.out.println("Não é possivel retornar o length de uma variavel não instanciada");
			
		
		} catch(NumberFormatException e) {
			
			System.out.println("Não é possivel realizar uma conversão");
			
		} catch(Exception e) {
			
			System.out.println("Erro na execução do programa");
			
		} finally {
			
			System.out.println("Sempre serei executado, ocorrendo exceções ou não");
			
		}
		 
	}
	
}
