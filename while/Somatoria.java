package While;

public class Somatoria {
	public static void main(String[] args) {
		
		int contador = 1, soma = 0;
		
		while (contador<=100) {
			
			System.out.print(contador+"+"+soma+"= ");
			soma = soma+contador;
			System.out.println(soma+"  ");
			contador++;
		}

	}
}
