package capitulo3;

public class TesteConta {
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();
		// Uma nova variavel do tipo Conta foi criado com nome de contaCorrente
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		//I Instanciamos uma classe criando filhos a partir do new
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Pedro";
		contaCorrente.cliente.idade = 17;
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 30;
		contaPoupanca.cliente.nome = "Daniel";
		contaPoupanca.cliente.idade = 18;
		
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 40;
		contaInvestimento.cliente.nome = "Luanee";
		contaInvestimento.cliente.idade = 19;
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente); // toda a estrutura do objeto sera printada, não so os atributos
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);
		
		System.out.println(contaPoupanca.saldo); 
		contaPoupanca.depositar(20.5);
		System.out.println(contaPoupanca.saldo);
	}
}
