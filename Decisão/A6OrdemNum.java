package prjDecisao;
import java.util.Scanner;

public class A6OrdemNum {

	public static void main(String[] args) {
		Scanner leitorEntrada = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, terceiroNumero;
		
		System.out.println("Digite valor de A");
		primeiroNumero = leitorEntrada.nextInt();
		System.out.println("Digite o valor de B");
		segundoNumero = leitorEntrada.nextInt();
		System.out.println("Digite o valor de C");
		terceiroNumero = leitorEntrada.nextInt();
		
		if (primeiroNumero >= segundoNumero && segundoNumero >= terceiroNumero) {
			System.out.println(primeiroNumero + " " + segundoNumero + " " + terceiroNumero);
		} else { 
			if (segundoNumero >= primeiroNumero && primeiroNumero >= terceiroNumero) {
				System.out.println(segundoNumero + " " + primeiroNumero + " " + terceiroNumero);
			} else { 
				if (primeiroNumero >= terceiroNumero && terceiroNumero >= segundoNumero) {
					System.out.println(primeiroNumero + " " + terceiroNumero + " " + segundoNumero);
				} else { 
					if (terceiroNumero >= primeiroNumero && primeiroNumero >= segundoNumero) {
						System.out.println(terceiroNumero + " " + primeiroNumero + " " + segundoNumero);
					} else {
						if (segundoNumero >= terceiroNumero && terceiroNumero >= primeiroNumero) {
							System.out.println(segundoNumero + " " + terceiroNumero + " " + primeiroNumero);
						} else {
							System.out.println(terceiroNumero + " " + segundoNumero + " " + primeiroNumero);
						}
					}
				}
			}
		}
		
		leitorEntrada.close();

	}

}
