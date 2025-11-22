package prjDecisao;
import java.util.Scanner;

public class At3Imc {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		
		double peso, altura, indiceMassaCorporal;
		
		System.out.println("Digite seu peso em Kg");
		peso = entradaDados.nextDouble();
		System.out.println("Digite sua altura em M");
		altura = entradaDados.nextDouble();
		
		indiceMassaCorporal = peso / (altura * altura);
		
		if (indiceMassaCorporal < 18.5) {
			System.out.println("Excesso de magreza");
		} else { 
			if (indiceMassaCorporal <= 25) {
				System.out.println("Peso normal");
			} else { 
				if (indiceMassaCorporal <= 30) {
					System.out.println("Excesso de peso");
				} else { 
					if (indiceMassaCorporal <= 35) {
						System.out.println("Obesidade grau 1");
					} else { 
						if (indiceMassaCorporal <= 40) {
							System.out.println("Obesidade grau 2");
						} else {
							System.out.println("Obesidade grau 3");
						}
					}
				}
			}
		}
		
		entradaDados.close();
	}

}
