package While;

import java.util.Scanner;

public class Taubada {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int multiplicando, multiplicador = 1, resultado;
		
		System.out.println("digite um número");
		multiplicando = entrada.nextInt();
		
		while (multiplicador<=10) {
			
			resultado = multiplicador*multiplicando;
			System.out.println(multiplicando+"x"+multiplicador+"= "+resultado);
			multiplicador++;
		}
		entrada.close();
	}
}
