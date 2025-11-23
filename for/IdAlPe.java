package For;
import java.util.Scanner;

public class IdAlPe {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade, altura, peso, contador=0, idade50=0, somaAltura=0, contAltura=0, peso40=0, idadeMinima=200, idadeMaxima=-1;
		double mediaAltura=0, percentual;
		
		for (contador=0; contador<25; contador++) {
			System.out.println("Digite sua idade");
			idade = entrada.nextInt();
			System.out.println("Digite sua altura (em centímetros)");
			altura = entrada.nextInt();
			System.out.println("Digite seu peso (em Kg)");
			peso = entrada.nextInt();
			
			if (idade>50) {
				idade50 = idade50+1;
			}
			
			if (idade>9 & idade<21) {
				somaAltura = somaAltura+altura;
				contAltura = contAltura+1;
			}
			
			if (peso>40) {
				peso40 = peso40+1;
			}
			
			if (idade<idadeMinima) {
				idadeMinima = idade;
			}
			
			if (idade>idadeMaxima) {
				idadeMaxima = idade;
			}
			
		}
		
		mediaAltura = somaAltura/contAltura;
		percentual = (peso40*100)/contador;
		
		System.out.println("Pessoas com idade superior a 50 anos: "+idade50+" Pessoas");
		System.out.println("Média de altura das pessoas entre 10 a 20 anos: "+mediaAltura);
		System.out.println("Porcentagem de pessoas com menos de 40kg: "+percentual+"%");
		System.out.println("Pessoa mais velha:"+idadeMaxima+" Anos");
		System.out.println("Pessoa mais nova: "+idadeMinima+" Anos");
		
		entrada.close();
	}

}
