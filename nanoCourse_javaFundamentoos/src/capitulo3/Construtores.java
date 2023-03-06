package capitulo3;

public class Construtores {

	private int numero;
	private double saldo;
	
	// O Construtor é o que faz ser possivel a criação 
	// De informações pro objeto
	
	public Construtores(int numero, double saldo) {
		this.numero = numero;						 // Pega o Atributo numero e faz ele ser o valor passado pelo Argumento Numero
		this.saldo = saldo; 						// Pega o Atributo saldo e faz ele ser o valor passado pelo Argumento saldo
	}
	
	// Podemos ter sobrecarga de construtores, contanto que os dados passados sejam diferentes
	
	// Podemos ter um só de numero
	public Construtores(int numero) {
		this.numero = numero;
	}
	
	// E ter um só de saldo
	public Construtores(double saldo) {
		this.saldo = saldo;
	}
	
// ========================================================================================================================================================================
	// Outros metodos
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
		
}
