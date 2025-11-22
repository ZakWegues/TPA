package prjDecisao;
import java.util.Scanner;

public class A4Equacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double coeficienteA, coeficienteB, coeficienteC, delta, raiz1, raiz2;
		
		System.out.println("Digite valor de A");
		coeficienteA = leitor.nextDouble();
		System.out.println("Digite o valor de B");
		coeficienteB = leitor.nextDouble();
		System.out.println("Digite o valor de C");
		coeficienteC = leitor.nextDouble();
		
		delta = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC);
		
		if (delta < 0) {
			System.out.println("Não existem raízes");
		} else { 
			if (delta == 0) {
				raiz1 = (-coeficienteB + delta) / (2 * coeficienteA);
				System.out.println(raiz1);
			} else {
				raiz1 = (-coeficienteB + Math.pow(delta, 0.5)) / (2 * coeficienteA);
				raiz2 = (-coeficienteB - Math.pow(delta, 0.5)) / (2 * coeficienteA);
				System.out.println(raiz1 + " e " + raiz2);
			}
		}
	leitor.close();
	}
}
