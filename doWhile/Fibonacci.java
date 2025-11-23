package DoWhile;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int limite, anterior = 0, atual = 1, contador = 1, proximo;
		
		System.out.println("digite o enésimo número");
		limite = entrada.nextInt();
		
		do {
			proximo = atual + anterior;
			System.out.println(proximo);
			anterior = 0 + atual;
			atual = 0 + proximo;
			contador++;
		} while (contador <= limite);
		
		
		entrada.close();
	}
}
