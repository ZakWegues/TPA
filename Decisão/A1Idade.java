package prjTomadaDecisao;
import java.util.Scanner;

public class At1Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int nasc, atual, i;
		
		System.out.println("Digite seu ano de nascimento");
		nasc = ler.nextInt();
		System.out.println("Digite o ano atual");
		atual = ler.nextInt();
		
		i = atual-nasc;
		
		if (i<=10) {
			System.out.println(i+" Criança");
		} else { if (i<18) {
			System.out.println(i+" Adolescente");
			} else { if (i<60) {
				System.out.println(i+" Adulto");
				} else {
					System.out.println(i+" Idoso");
				}
			}
		}
		
		ler.close();
	}

}
