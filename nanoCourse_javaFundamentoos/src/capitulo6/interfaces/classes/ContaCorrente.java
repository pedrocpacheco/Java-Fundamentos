package capitulo6.interfaces.classes;

import capitulo6.interfaces.aInterface.Transferivel;

public class ContaCorrente implements Transferivel {

	@Override
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
