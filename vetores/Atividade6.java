package vetor;

public class Atividade6 {

	public static void main(String[] args) {
		int vetorResultado[], indice=0, contador=0, valorInicial=1;
		
		final int TAMANHO=11;
		
		vetorResultado = new int [TAMANHO];
		
		
		for (indice=0; indice<TAMANHO; indice++) {
			
			
			while (contador<indice) {
				valorInicial=valorInicial*2;
				contador++;
			}
			vetorResultado[indice]=valorInicial;
		}
		
		for (indice=0; indice<TAMANHO; indice++) {
			System.out.println(vetorResultado[indice]+" ");	
		}
	}

}
