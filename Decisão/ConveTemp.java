package prjDecisao;
import java.util.Scanner;

public class ConveTemp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double temperaturaFahrenheit, temperaturaCelsius;
		
		System.out.println("Digite a temperatura em fahrenheit");
		temperaturaFahrenheit = entrada.nextDouble();
		
		temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;
		System.out.print("Temperatura em °c " + temperaturaCelsius);
		
		if (temperaturaCelsius < 15) {
			System.out.println(" Frio");
		} else { 
			if (temperaturaCelsius < 22) {
				System.out.println(" Ameno");
			} else { 
				System.out.println(" Calor"); 
			}
		}
		entrada.close();
	}

}
