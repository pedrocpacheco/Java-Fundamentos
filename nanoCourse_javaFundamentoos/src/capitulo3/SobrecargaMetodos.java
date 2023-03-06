package capitulo3;

public class SobrecargaMetodos {
	
	double saldo;
	
	public void retirar(double valor) {
		saldo -= valor;
	}
	
	private double retirar(double valor, double taxa) {
		return saldo = saldo - valor - taxa;
		
	// O metodo pode ter o mesmo nome, o que diferencia ele são as assinaturas
	// A assinatura são os tipos e quantidades de dados dos argumentos
	}

}
