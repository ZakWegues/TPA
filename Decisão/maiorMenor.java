package prjDecisao;
import java.util.Scanner;

public class maiorMenor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idade1, idade2, idade3, idade4, idade5, contadorMaiores = 0, contadorMenores = 0, percentualMenores, percentualMaiores;
		
		System.out.println("Digite digite a 1° idade");
		idade1 = leitor.nextInt();
		System.out.println("Digite digite a 2° idade");
		idade2 = leitor.nextInt();
		System.out.println("Digite digite a 3° idade");
		idade3 = leitor.nextInt();
		System.out.println("Digite digite a 4° idade");
		idade4 = leitor.nextInt();
		System.out.println("Digite digite a 5° idade");
		idade5 = leitor.nextInt();
		
		if (idade1 > 17) {
			contadorMaiores = contadorMaiores + 1;
		} else {
			contadorMenores = contadorMenores + 1;
		}
		
		if (idade2 > 17) {
			contadorMaiores = contadorMaiores + 1;
		} else {
			contadorMenores = contadorMenores + 1;
		}
		
		if (idade3 > 17) {
			contadorMaiores = contadorMaiores + 1;
		} else {
			contadorMenores = contadorMenores + 1;
		}
		
		if (idade4 > 17) {
			contadorMaiores = contadorMaiores + 1;
		} else {
			contadorMenores = contadorMenores + 1;
		}
		
		if (idade5 > 17) {
			contadorMaiores = contadorMaiores + 1;
		} else {
			contadorMenores = contadorMenores + 1;
		}
		
		percentualMaiores = (contadorMaiores * 100) / 5;
		percentualMenores = (contadorMenores * 100) / 5;
		
		System.out.println(contadorMaiores + " Pessoas maiores de idade " + percentualMaiores + "% do total");
		System.out.println(contadorMenores + " Pessoas menores de idade " + percentualMenores + "% do total");
		
		leitor.close();
	}

}
