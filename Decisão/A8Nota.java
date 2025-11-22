package prjDecisao;
import java.util.Scanner;

public class A8Nota {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double nota1, nota2, notaExame, mediaInicial, mediaFinal;
		
		System.out.println("Digite sua 1° nota");
		nota1 = leitor.nextDouble();
		System.out.println("Digite sua 2° nota");
		nota2 = leitor.nextDouble();
		
		mediaInicial = (nota1 + nota2) / 2;
		
		if (mediaInicial < 3) {
			System.out.println("Reprovado");
		} else { 
			if (mediaInicial >= 6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Novo exame. Apresente a nota do novo exame");
				notaExame = leitor.nextDouble();
				mediaFinal = (notaExame + mediaInicial) / 2;
					if (mediaFinal >= 6) {
						System.out.println("Aprovado");
					} else {
						System.out.println("Reprovado");
				}
			}
		}
		
	leitor.close();
	}

}
