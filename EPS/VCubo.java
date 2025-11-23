package EPS;
import java.util.Scanner;

public class VCubo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int medidaAresta, volumeCalculado;
		
		System.out.println("Digite a aresta do cubo");
		medidaAresta = entrada.nextInt();
		
		volumeCalculado = medidaAresta * medidaAresta * medidaAresta;
		
		System.out.println("Volume= " + volumeCalculado);
				
	entrada.close();
	}

}
