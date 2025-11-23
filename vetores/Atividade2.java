package vetor;

import java.util.Scanner;
public class At2Tabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int vetorNumeros[], indice=0, resultadoCalculo, fatorMultiplicador=0;
		
		final int TAMANHO=5;
		
		vetorNumeros = new int [TAMANHO];
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println("Digite o "+(indice+1)+" número");
			vetorNumeros[indice] = entrada.nextInt();
		}
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println("Tabuada do "+vetorNumeros[indice]+":");
			
			for (fatorMultiplicador=1; fatorMultiplicador<=10; fatorMultiplicador++) {
				resultadoCalculo = fatorMultiplicador*vetorNumeros[indice];
				System.out.println(fatorMultiplicador+"x"+vetorNumeros[indice]+"= "+resultadoCalculo);
			}
		}
		
		entrada.close();


    
	}
}
