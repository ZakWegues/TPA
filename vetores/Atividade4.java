package vetor;

import java.util.Scanner;
public class At4RelacaoPar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		int vetorNumeros[], indice=0, numeroPar=0;
		
		final int TAMANHO=10;
		
		vetorNumeros = new int [TAMANHO];
		
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println("Digite o "+(indice+1)+" número");
			vetorNumeros[indice] = entrada.nextInt();
		}
		
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.print(vetorNumeros[indice]+" e sua relação de pares:");
      
			for (numeroPar=0; numeroPar<=vetorNumeros[indice]; numeroPar=numeroPar+2) {
				System.out.print(numeroPar+" ");
				}
				System.out.println(" ");
		}
		
		entrada.close();

	}

}
