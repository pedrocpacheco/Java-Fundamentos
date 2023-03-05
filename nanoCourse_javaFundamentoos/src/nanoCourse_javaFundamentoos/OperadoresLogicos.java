package nanoCourse_javaFundamentoos;

public class OperadoresLogicos {

	public static void main(String[] args) {
	
		// OPERADOR E
		int idade = 20;
		
		boolean precisaVotar = idade >=18 && idade <= 70;
		// o valor so será TRUE se as DUAS operações corretas
		
		System.out.println(precisaVotar); // True, pois a idade esta entre 18 e 70
		
// ==============================================================================
		
		// OPERADOR OU
		int crAmarelo = 2, crVermelho = 1;
		
		boolean expulso = crAmarelo == 2 || crVermelho == 1;
		// O valor será verdadeiro se UMA das DUAS declarações ou AS DUAS forem corretas
	
		System.out.println(expulso); // TRUE, pois as duas estão certas (mas poderia ser só uma)
		
// ==============================================================================
		
		// OPERADOR OU EXCLUSIVO
		int x = 9, y = 11;
		
		boolean ouExclusivo = x > 10 ^ y > 10;
		// O valor será verdadeiro APENAS se UMA das DUAS estiver correta
		// Se as DUAS forem corretas, o boolean será FALSO
		
		System.out.println(ouExclusivo); // TRUE, pois só uma das duas está correta
		
		
//	==============================================================================
			
		//OPERADOR NOT
		int exemplo = 22;
		
		boolean resultado = !(exemplo >= 18);
		// O boolean será verdadeiro se o exemplo NÃO FOR maior do que 18
		
		System.out.println(resultado); // FALSO - pois 22 é maior que 18
		
		
	}

}
