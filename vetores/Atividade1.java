package vetor;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int vetorA[], vetorB[], indice, contadorPar=0, indiceImpar=0;
		
		final int TAMANHO = 20;
		
		vetorA = new int [TAMANHO];
		vetorB = new int [TAMANHO];
		
		//Leitura de dados
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println("Digite o "+(indice+1)+" número");
			//verificando números pares
			vetorA[indice] = entrada.nextInt();
				if (vetorA[indice]%2==0) {
					vetorB[contadorPar] = vetorA[indice];
					contadorPar++;
					indiceImpar = contadorPar;
				}
			}
		//verificando números impares
		for (indice=0; indice<TAMANHO; indice++) {
			if (vetorA[indice]%2!=0) {
				vetorB[indiceImpar] = vetorA[indice];
				indiceImpar++;
			}
		}
		
		System.out.print("B: [ ");
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.print(vetorB[indice]+" ");
		}
		System.out.println("] ");
		
		entrada.close();

	}

}
