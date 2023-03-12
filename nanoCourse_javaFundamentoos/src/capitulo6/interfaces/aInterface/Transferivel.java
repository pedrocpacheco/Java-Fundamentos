package capitulo6.interfaces.aInterface;

public interface Transferivel {
	
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor);

	public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor);

	public default int somaBancoEAgencia(int nrBanco, int nrAgencia) {
		
		return nrBanco + nrAgencia;
				
	}
	
}
