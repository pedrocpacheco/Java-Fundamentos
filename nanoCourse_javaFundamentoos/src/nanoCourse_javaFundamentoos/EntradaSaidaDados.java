package nanoCourse_javaFundamentoos;

import java.util.Scanner;

public class EntradaSaidaDados {

	public static void main(String[] args) {

		int idade = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine(); // Somente o sc.next(); faz o console só capturar a 1 palavra
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		System.out.println(nome);
		
		if (idade < 0)
			System.out.println("Idade Invalida");

		if (idade >= 18 && idade <= 70) {
			System.out.println("Maior Idade");
		} else if (idade >= 70){
			System.out.println("Terceira idade");
			if (idade >= 100) {
				System.out.println("E Centanaria");
			}
		} else {
			System.out.println("Menor Idade");
		}

	}

}
