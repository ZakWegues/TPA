package EPS;
import java.util.Scanner;

public class VLata {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int raioLata, alturaLata;
		double volumeCalculado;
		
		System.out.println("Digite o raio da lata");
		raioLata = entrada.nextInt();
		System.out.println("Digite a altura da lata");
		alturaLata = entrada.nextInt();
		
		volumeCalculado = 3.14 * raioLata * raioLata * alturaLata;
		
		System.out.println("Volume= " + volumeCalculado);
				
	entrada.close();

	}

}
