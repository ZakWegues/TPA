package vetor;
import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int vetorA[], vetorB[], indice=0;
		
		final int TAMANHO=10;
		
		vetorA = new int [TAMANHO];
		vetorB = new int [TAMANHO];
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println("Digite o "+(indice+1)+"º número de A");
			vetorA[indice] = entrada.nextInt();
		}
		
		for (indice=0; indice<TAMANHO; indice++) {
			
			if (vetorA[indice]%2==0) {
				vetorB[indice]=1;
			} else {
				vetorB[indice]=0;
			}
		}
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.print(vetorB[indice]+" ");
		}
		entrada.close();

	}

}
