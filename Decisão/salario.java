package prjDecisao;
import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valorSalario;
		
		System.out.println("Digite seu salário");
		valorSalario = entrada.nextDouble();
		
		if(valorSalario > 1302) {
			System.out.println("Acima do salário mínimo");
		} else {
			System.out.println("Abaixo do salário mínimo");
		}
		entrada.close();
	}

}
