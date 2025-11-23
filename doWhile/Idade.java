package DoWhile;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double percentualFaixa1, percentualFaixa2, percentualFaixa3, percentualFaixa4, percentualFaixa5;
		int contadorFaixa1 = 0, contadorFaixa2 = 0, contadorFaixa3 = 0, contadorFaixa4 = 0, contadorFaixa5 = 0, idade, totalPessoas = 0, resposta;
		
		do {
			
			System.out.println("Digite a idade");
			idade = entrada.nextInt();
			
			if (idade < 16) {
				System.out.println("1° Faixa");
				contadorFaixa1 = contadorFaixa1 + 1;
				} else { if (idade <= 31) {
					System.out.println("2° Faixa");
					contadorFaixa2 = contadorFaixa2 + 1;
					}  else { if (idade <= 46) {
						System.out.println("3° Faixa");
						contadorFaixa3 = contadorFaixa3 + 1;
						} else { if (idade <= 61) {
							System.out.println("4° Faixa");
							contadorFaixa4 = contadorFaixa4 + 1;
							} else {
								System.out.println("5° Faixa");
								contadorFaixa5 = contadorFaixa5 + 1;
							}
						}
					}
				}
			
			totalPessoas++;
			System.out.println("Deseja continuar? 1-sim 2-não");
			resposta = entrada.nextInt();
		}	while (resposta < 2);
		
		percentualFaixa1 = (contadorFaixa1 * 100.0) / totalPessoas;
		percentualFaixa2 = (contadorFaixa2 * 100.0) / totalPessoas;
		percentualFaixa3 = (contadorFaixa3 * 100.0) / totalPessoas;
		percentualFaixa4 = (contadorFaixa4 * 100.0) / totalPessoas;
		percentualFaixa5 = (contadorFaixa5 * 100.0) / totalPessoas;
		
		System.out.println("1° Faixa: " + contadorFaixa1 + " Pessoas e " + percentualFaixa1 + "% do total");
		System.out.println("2° Faixa: " + contadorFaixa2 + " Pessoas e " + percentualFaixa2 + "% do total");
		System.out.println("3° Faixa: " + contadorFaixa3 + " Pessoas e " + percentualFaixa3 + "% do total");
		System.out.println("4° Faixa: " + contadorFaixa4 + " Pessoas e " + percentualFaixa4 + "% do total");
		System.out.println("5° Faixa: " + contadorFaixa5 + " Pessoas e " + percentualFaixa5 + "% do total");
		
			
		entrada.close();



    
	}

}
