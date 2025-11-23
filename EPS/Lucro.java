package EPS;
import java.util.Scanner;

public class Lucro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double precoCompra, precoVenda, quantidadeVendida, lucroUnitario, lucroTotal;
		
		System.out.println("Digite o preço do produto");
		precoCompra = entrada.nextDouble();
		System.out.println("Digite a quantidade vendida");
		quantidadeVendida = entrada.nextDouble();
		System.out.println("Digite o preço de venda");
		precoVenda = entrada.nextDouble();
		
		lucroUnitario = precoVenda - precoCompra;
		lucroTotal = lucroUnitario * quantidadeVendida;
		
		System.out.println("Lucro total: " + lucroTotal);

	entrada.close();
	}

}
