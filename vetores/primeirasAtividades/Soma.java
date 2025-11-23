package vetor;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int vetorA[], vetorB[], vetorC[], indice=0;
		
		final int TAMANHO=10;
		
		vetorA = new int [TAMANHO];
		vetorB = new int [TAMANHO];
		vetorC = new int [TAMANHO];
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println("digite o "+(indice+1)+" número do vetor A");
			vetorA[indice] = entrada.nextInt();
		}
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println("digite o "+(indice+1)+" número do vetor B");
			vetorB[indice] = entrada.nextInt();
		}
		
		for (indice=0; indice<TAMANHO; indice++) {
		vetorC[indice] = vetorA[indice]+vetorB[indice];
		System.out.print(vetorC[indice]+" ");
		
		}
		
		entrada.close();
	}

}
