package EPS;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int anoNascimento, anoAtual, idadeCalculada;
		
		System.out.println("Digite o ano de nascimento");
		anoNascimento = entrada.nextInt();
		System.out.println("Digite o ano atual");
		anoAtual = entrada.nextInt();

		idadeCalculada = anoAtual - anoNascimento;
		
		System.out.println("Idade: " + idadeCalculada);

	entrada.close();

    
	}
}
