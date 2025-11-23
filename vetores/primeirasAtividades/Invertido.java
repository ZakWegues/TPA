package vetor;
import java.util.Scanner;

public class Inverso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int vetorA[], vetorB[], indice=0;
		
		final int TAMANHO=10;
		
		vetorA = new int [TAMANHO];
		vetorB = new int [TAMANHO];
		
		for (indice=0; indice<10; indice++) {
			System.out.println("Digite um número");
			vetorA[indice] = entrada.nextInt();
		}
		for (indice=9; indice>=0; indice--) {
			vetorB[indice] = vetorA[indice];
			System.out.println(vetorB[indice]);
		}
	
	entrada.close();
	}
	
}
