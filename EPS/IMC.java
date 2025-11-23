package EPS;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int pesoPessoa;
		double alturaPessoa, indiceMassaCorporal;
		
		System.out.println("Digite o peso da pessoa");
		pesoPessoa = leitor.nextInt();
		System.out.println("Digite a altura da pessoa");
		alturaPessoa = leitor.nextDouble();
		
		indiceMassaCorporal = pesoPessoa / (alturaPessoa * alturaPessoa);
		
		System.out.println("imc = " + indiceMassaCorporal);
				
	leitor.close();

	}

}
