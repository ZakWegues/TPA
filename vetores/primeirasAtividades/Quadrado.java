package vetor;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			int vetorA[], vetorB[], indice=0;
			
			final int TAMANHO=10;
			
			vetorA = new int [TAMANHO];
			vetorB = new int [TAMANHO];
			
			for (indice=0; indice<TAMANHO; indice++) {
				System.out.println("digite o "+(indice+1)+" número");
				vetorA[indice] = entrada.nextInt();
			}
			
			for (indice=0; indice<TAMANHO; indice++) {
			vetorB[indice] = vetorA[indice]*vetorA[indice];
			System.out.print(vetorB[indice]+" ");
			
			}
			
			entrada.close();
		}
}
