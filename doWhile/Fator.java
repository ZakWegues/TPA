package DoWhile;

import java.util.Scanner;

public class Fator {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, contador = 0;
		
		System.out.println("digite um número");
		numero = entrada.nextInt();
		
		contador = (contador + numero) - 1;
		
		do {
		
			numero = numero * contador;
			contador--;
		} while (contador > 0);
		System.out.println(numero);
		
		entrada.close();
	}
}
