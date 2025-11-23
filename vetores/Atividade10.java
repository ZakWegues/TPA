package vetor;
import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int vetorA[], vetorB[], vetorC[], indiceA=0, indiceB=0, indiceC=0, totalDiferenca=0, contadorDiferenca=0;
		
		final int TAMANHO=10;
		
		vetorA = new int [TAMANHO];
		vetorB = new int [TAMANHO];
		vetorC = new int [TAMANHO];
		
		for (indiceA=0; indiceA<TAMANHO; indiceA++) {
			System.out.println("Digite o "+(indiceA+1)+"º número de A");
			vetorA[indiceA] = entrada.nextInt();
		}
		
		for (indiceA=0; indiceA<TAMANHO; indiceA++) {
			System.out.println("Digite o "+(indiceA+1)+"º número de B");
			vetorB[indiceA] = entrada.nextInt();
		}
		
		System.out.println("Os números presentes em A que não estão presentes em B são:");
		
		for (indiceA=0; indiceA<TAMANHO; indiceA++) {
			
			for (indiceB=0;  indiceB<TAMANHO; indiceB++) {
				if (vetorA[indiceA]!=vetorB[indiceB]) {
					
					contadorDiferenca++;
					}
				}
				
			if(contadorDiferenca==TAMANHO) {
				vetorC[indiceC]=vetorA[indiceA];
				indiceC++;
			}
			
			totalDiferenca=indiceC;
			
			contadorDiferenca=0;
		}
		
		for (indiceC=0; indiceC<totalDiferenca; indiceC++) {
			System.out.print(vetorC[indiceC]+" ");
		}
		
		entrada.close();

	}

}
