package vetor;
import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int vetorOriginal[], vetorInvertido[], indiceOriginal=0, indiceInvertido=0, contadorIguais=0;
		
		final int TAMANHO=10;
		
		vetorOriginal = new int [TAMANHO];
		vetorInvertido = new int [TAMANHO];
		
		for (indiceOriginal=0; indiceOriginal<TAMANHO; indiceOriginal++) {
			System.out.println("Digite o "+(indiceOriginal+1)+"º algarismo do seu número");
			vetorOriginal[indiceOriginal] = entrada.nextInt();
		}
		
		for (indiceOriginal=9; indiceOriginal>=0; indiceOriginal--) {
			vetorInvertido[indiceInvertido] = vetorOriginal[indiceOriginal];
			indiceInvertido++;
		}
		
		for (indiceOriginal=0; indiceOriginal<TAMANHO; indiceOriginal++) {
			if (vetorOriginal[indiceOriginal]==vetorInvertido[indiceOriginal]) {
				contadorIguais = contadorIguais+1;
			}
		}
		
		if (contadorIguais==TAMANHO) {
			System.out.println("Seu número é um Palíndromo");
		} else {
			System.out.println("Seu número não é um Palíndromo");
		}
		entrada.close();
	}

}
