package vetor;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int vetorNumeros[], indice=0, numeroBusca, flagEncontrado=0, valorEncontrado=0;
		
		final int TAMANHO=10;
		
		vetorNumeros = new int [TAMANHO];
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println("Digite o "+(indice+1)+"º número de A");
			vetorNumeros[indice] = entrada.nextInt();
		}
		
		System.out.println("Digite o número que deseja verificar");
		numeroBusca = entrada.nextInt();
		
		for (indice=0; indice<TAMANHO; indice++) {
			if (vetorNumeros[indice]==numeroBusca) {
				flagEncontrado=1;
				valorEncontrado=vetorNumeros[indice];
			} 
		}
		
		if (flagEncontrado>0) {
			System.out.println("Seu número está armazenado no programa: "+valorEncontrado);
		} else {
			System.out.println("Seu número não está armazenado no programa");
		}
		entrada.close();

	}

}
