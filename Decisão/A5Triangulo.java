package prjDecisao;
import java.util.Scanner;

public class A5Triangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int ladoA, ladoB, ladoC;
		
		System.out.println("Digite valor de A");
		ladoA = entrada.nextInt();
		System.out.println("Digite o valor de B");
		ladoB = entrada.nextInt();
		System.out.println("Digite o valor de C");
		ladoC = entrada.nextInt();
		
		if (ladoC > (ladoA + ladoB) || ladoA > (ladoB + ladoC) || ladoB > ladoA + ladoC) {
			System.out.println("Não é triangulo");
		} else { 
			if (ladoA == ladoB && ladoB == ladoC) { // Corrigido de & para &&
				System.out.println("triângulo equilatero");
			} else { 
				if (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) { // Corrigido de & para &&
					System.out.println("Triângulo escaleno");
				} else {
					System.out.println("Triângulo isósceles");
				}
			}
		}
		
	entrada.close();
	}

}
