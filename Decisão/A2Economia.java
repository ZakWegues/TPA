package prjDecisao;
import java.util.Scanner;

public class A2Economia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double consumoMedio, distanciaPercorrida, capacidadeTanque;
		
		System.out.println("Digite a distância percorrida em KM");
		distanciaPercorrida = entrada.nextDouble();
		System.out.println("Digite  a capacidade do tanque em litros");
		capacidadeTanque = entrada.nextDouble();
		
		consumoMedio = distanciaPercorrida / capacidadeTanque;
		
		if (consumoMedio >= 10) {
			System.out.println(consumoMedio + "km/L Econômico");
		} else {
			System.out.println(consumoMedio + "km/L Não econômico");
		}
		entrada.close();
	}

}
