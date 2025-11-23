package While;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int contador=1, maiores=0, menores=0, idade;
		
		while (contador<=5) {
			
			System.out.println("Digite a idade");
			idade = entrada.nextInt();
			if (idade>=18) {
				maiores = maiores+1;
			} else {
				menores = menores+1;
			}
			contador++;
		}
		
		System.out.println(maiores+" maiores de idade");
		System.out.println(menores+" menores de idade");
		
		entrada.close();
	}
}
