package EPS;
import java.util.Scanner;

public class BxA {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int altura, base;
		double areaCalculada;
		
		System.out.println("Digite a base");
		base = entrada.nextInt();
		System.out.println("Digite a altura");
		altura = entrada.nextInt();

		areaCalculada = (base * altura) / 2.0;
		
		System.out.println("area: " + areaCalculada);

	entrada.close();
	}

}
