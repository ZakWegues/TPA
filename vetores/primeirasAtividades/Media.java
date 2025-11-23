package vetor;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		int vetorValores[], indice=0;
		double somaValores=0;
		
		final int TAMANHO = 10;
		
		vetorValores = new int [TAMANHO];
		
		for(indice=0; indice<TAMANHO; indice++) {
			System.out.println("Digite o valor "+(indice+1));
			vetorValores[indice] = entrada.nextInt();
			somaValores = somaValores+vetorValores[indice];
		}
		
		somaValores = somaValores/TAMANHO;
		System.out.println("A média dos valores é: "+somaValores);
		
		entrada.close();
	}

}
