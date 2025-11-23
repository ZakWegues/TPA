package EPS;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double precoOriginal, precoPix, precoCredito;
		
		System.out.println("Digite o preço");
		precoOriginal = entrada.nextDouble();
		
		precoPix = precoOriginal * 0.9;
		precoCredito = precoOriginal * 1.05;
		
		System.out.println("pix: " + precoPix + " credito: " + precoCredito);
		
	entrada.close();
	}

}
