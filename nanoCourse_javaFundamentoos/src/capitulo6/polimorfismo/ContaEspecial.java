package capitulo6.polimorfismo;

public abstract class ContaEspecial extends Conta{
	
	private double limite;
	public static final int BANCO = 33;
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		
		if(saldo < valor + limite) {
			throw new SaldoInsuficienteException();
		}
		
		saldo -= valor;				
		
	}

	public abstract double verificarSaldo();
	
}
