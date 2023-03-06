package capitulo3;

public class Conta {

		int numero;
		double saldo;
		
		Cliente cliente = new Cliente(); // podemos ter classes dentro de classes
		
		/*
		 * O Double quer dizer que o metodo recuperarSaldo retornará um 
		 * Valor com tipo double
		 */
		public double recuperarSaldo() {
			return saldo;
		}
		
		// Para a lógica funcionar precisamos do valor 
		// Double que será depositado
		public void depositar(double valor) {
			saldo += valor;
		}
		
}
