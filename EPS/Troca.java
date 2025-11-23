package EPS;
import java.util.Scanner;

public class Troca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valorA, valorB, auxiliar;
		
		System.out.println("Digite A");
		valorA = entrada.nextInt();
		System.out.println("Digite B");
		valorB = entrada.nextInt();
		
		auxiliar = valorA;
		valorA = valorB;
		valorB = auxiliar;
		
		System.out.println(valorA + " " + valorB);

	entrada.close();
	}

}
