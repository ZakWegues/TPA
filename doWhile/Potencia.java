package DoWhile;

import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int base, expoente, resultadoPotencia = 1, contador = 1;
		
		System.out.println("digite a base");
		base = entrada.nextInt();
		System.out.println("digite o expoente");
		expoente = entrada.nextInt();
		
		do {
			resultadoPotencia = resultadoPotencia * base;
			contador++;
		} while (contador <= expoente);	
		
	System.out.println(resultadoPotencia);
	entrada.close();


    
	}
}
