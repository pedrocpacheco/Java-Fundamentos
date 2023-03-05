package nanoCourse_javaFundamentoos;

public class IncrementoDecremento {

	public static void main(String[] args) {
		int x = 10;
//		int x = x + 1  		Quando queremos sumar 1 à uma variavel, podemos fazer diferente
		
		x++; //	Resulta no mesmo resultado final, mas é uma maneira melhor
		System.out.println(x);
		
		x--; // 10 + 1 = 11 -> 11 - 1 = 10 de novo
		System.out.println(x);
		
		// Também podemos escrever os ++ e -- antes do NomeDaVariavel
		int y = 10;
		
		++y;
		System.out.println(y);
		
		--y;
		System.out.println(y);
		
		// Mas, precisamos tomar CUIDADO! Porque tem DIFERENÇA entre ++ ANTES ou DEPOIS
		
		int z = 10, w = 5, a = 5; //Podemos declarar variaveis do mesmo tipo na mesma linha
		
		// ++ Depois
		z = w++;
		System.out.println(z); // = 5
		System.out.println(w); // = 6 (5++ | 5 + 1)
		// Nesse caso, como o Z recebe o W antes do ++, o valor de Z vai ser o de W desatualizado
		
		// -- Antes
		z = --a;
		System.out.println(z); // = 4
		System.out.println(a); // = 4
		//Nesse caso, como o Z recebeu o Y depois do --, o valor de Z vai ser o de A atualizado

	}

}
