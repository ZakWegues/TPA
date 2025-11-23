package vetor;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		int vetorNumeros[], indice=0, divisor=0;
				
				final int TAMANHO=10;
				
				vetorNumeros = new int [TAMANHO];
				
				for (indice=0; indice<TAMANHO; indice++) {
					System.out.println("Digite o "+(indice+1)+" número");
					vetorNumeros[indice] = entrada.nextInt();
				}
				
			
				for (indice=0; indice<TAMANHO; indice++) {
					System.out.print(vetorNumeros[indice]+" e sua relação de divisores:");
					
				for (divisor=1; divisor<=vetorNumeros[indice]; divisor++) {
					if (vetorNumeros[indice]%divisor==0) {
						System.out.print(divisor+" ");
						}
					}
					System.out.println(" ");
				}
				
				entrada.close();

	}

}
