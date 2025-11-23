package EPS;
import java.util.Scanner;

public class Festa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int homens, mulheres, totalSalgados;
		double totalRefrigerante, totalBolo;
		
		System.out.println("Digite a quantidade de homens");
		homens = entrada.nextInt();
		System.out.println("Digite a quantidade de mulheres");
		mulheres = entrada.nextInt();
		
		totalSalgados = (homens * 10) + (mulheres * 6);
		totalRefrigerante = ((homens * 800) + (mulheres * 600)) / 1000.0;
		totalBolo = ((homens + mulheres) * 100) / 1000.0;
		
		
		System.out.println("salgados: " + totalSalgados + " refrigerante: " + totalRefrigerante + "L bolo: " + totalBolo + " Kg");
		
	entrada.close();
	}
}
