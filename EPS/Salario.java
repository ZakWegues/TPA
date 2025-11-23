package EPS;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double salarioBruto, descontoInss, descontoVt, totalDesconto, salarioLiquido;
		
		System.out.println("Digite o salário bruto");
		salarioBruto = entrada.nextDouble();
		
		descontoInss = salarioBruto * 0.08;
		descontoVt = salarioBruto * 0.06;
		totalDesconto = descontoInss + descontoVt;
		salarioLiquido = salarioBruto - totalDesconto;
		
		System.out.println("Salário líquido: " + salarioLiquido);
		
	entrada.close();
	}

}
