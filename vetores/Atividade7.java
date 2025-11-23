package vetor;
import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int vetorA[], vetorB[], indice=0, auxiliar;
		
		final int TAMANHO=15;
		
		vetorA = new int [TAMANHO];
		vetorB = new int [TAMANHO];
		
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println("Digite o "+(indice+1)+" número");
			vetorA[indice] = entrada.nextInt();
		}
		
		for (indice=0; indice<TAMANHO; indice++) {
		
			auxiliar=vetorA[indice]--;
			do {
				vetorA[indice]=auxiliar*vetorA[indice];
				auxiliar--;
			} while (auxiliar>0);
			vetorB[indice]=vetorA[indice];
		}
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println(vetorB[indice]+" ");	
		}
		
	
		entrada.close();

	}

}
