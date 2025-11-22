package prjDecisao;
import java.util.Scanner;

public class A9Desconto {

	public static void main(String[] args) {
		Scanner leitorEntrada = new Scanner(System.in);
		
		double salarioBruto, valorIrpf;
		
		System.out.println("Digite seu salário");
		salarioBruto = leitorEntrada.nextDouble();
		
		if(salarioBruto<=1434.59) {
			System.out.println("isento do IRPF");
		} else { 
			if (salarioBruto<=2150) {
				valorIrpf = salarioBruto*7.5/100-107.59;
				System.out.println("Desconto IRPF: R$"+valorIrpf);
			} else { 
				if (salarioBruto<=2866.70) {
					valorIrpf = salarioBruto*15/100-268.84;
					System.out.println("Desconto IRPF: R$"+valorIrpf);
				} else { 
					if (salarioBruto<=2150) {
						valorIrpf = salarioBruto*22.5/100-483.84;
						System.out.println("Desconto IRPF: R$"+valorIrpf);
					} else {
						valorIrpf = salarioBruto*27.5/100-662.94;
						System.out.println("Desconto IRPF: R$"+valorIrpf);
					}
				}
			}
		}
		
		leitorEntrada.close();
	}

}
