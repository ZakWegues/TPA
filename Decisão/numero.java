package prjDecisao;
import java.util.Scanner;

public class numero {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double valorNumerico;
		
		System.out.println("Digite um número");
		valorNumerico = leitor.nextDouble();
		
		if (valorNumerico > 0) {
			System.out.println("número positivo");
		} else {
			if (valorNumerico == 0) {
				System.out.println("número neutro");
			} else { 
				System.out.println("número negativo");
			}
		}
		leitor.close();
	}

}
