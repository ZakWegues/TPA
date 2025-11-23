package vetor;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int vetorNumeros[], indice=0;
		
		final int TAMANHO=10;
		
		vetorNumeros = new int [TAMANHO];
		
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println("Digite o "+(indice+1)+" número");
			vetorNumeros[indice] = entrada.nextInt();
		}
		
		
		for (indice=0; indice<TAMANHO; indice++) {
			
			if (vetorNumeros[indice]==2 || vetorNumeros[indice]==3 ||  vetorNumeros[indice]==5 || vetorNumeros[indice]==7) {
				System.out.println(vetorNumeros[indice]+" É primo");
				} 
				
				else { if (vetorNumeros[indice]%2==0 || vetorNumeros[indice]%3==0 || vetorNumeros[indice]%5==0 || vetorNumeros[indice]%7==0 || vetorNumeros[indice]%9==0) {
					System.out.println(vetorNumeros[indice]+" Não é primo");
					} else {
						System.out.println(vetorNumeros[indice]+" É primo");
					}
				}	
		}
		entrada.close();


    
	}

}
