package vetor;
import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int vetorA[], vetorB[], vetorC[], indiceA=0, indiceB=0, indiceC=0, totalIntersecao=0;
		
		final int TAMANHO=5;
		
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
		
		System.out.println("A interseção de números entre A e B é:");
		
		for (indiceA=0; indiceA<TAMANHO; indiceA++) {
			
			for (indiceB=0;  indiceB<TAMANHO; indiceB++) {
				
				if (vetorA[indiceA]==vetorB[indiceB]) {
					vetorC[indiceC] = vetorA[indiceA];
					indiceC++;
				}
				
				totalIntersecao=indiceC;
			}
		}
		
		for (indiceA=0; indiceA<totalIntersecao; indiceA++) {
			System.out.print(vetorC[indiceA]+" ");
		}
		entrada.close();

	}

}
