package prjDecisao;
import java.util.Scanner;

public class Exame {

	public static void main(String[] args) {
		Scanner leitorEntrada = new Scanner(System.in);
		
		double notaUm, notaDois, notaTres, notaQuatro, notaExame, mediaParcial, mediaFinal;
		
		System.out.println("Digite sua 1° nota");
		notaUm = leitorEntrada.nextDouble();
		System.out.println("Digite sua 2° nota");
		notaDois = leitorEntrada.nextDouble();
		System.out.println("Digite sua 3° nota");
		notaTres = leitorEntrada.nextDouble();
		System.out.println("Digite sua 4° nota");
		notaQuatro = leitorEntrada.nextDouble();
		
		mediaParcial = (notaUm + notaDois + notaTres + notaQuatro) / 4;
		System.out.println("Média: " + mediaParcial);
		
		if (mediaParcial >= 7) {
			System.out.println("Aprovado");
		} else { 
			if (mediaParcial < 5) {
				System.out.println("Reprovado");
			} else {
				System.out.println("Exame");
				notaExame = leitorEntrada.nextDouble();
				mediaFinal = (notaExame + mediaParcial) / 2;
					if (mediaFinal >= 7) {
						System.out.println("Aprovado no exame");
					} else {
						System.out.println("Reprovado no exame");
				}
			}
		}
		
	leitorEntrada.close();

	}

}
