package capitulo6.polimorfismo;

public class Conta {

	protected double saldo;
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		
		if (valor > saldo) {
			throw new SaldoInsuficienteException();
		} 
		
		saldo -= valor;
		
	}
	
}
