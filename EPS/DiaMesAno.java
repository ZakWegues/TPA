package EPS;
import java.util.Scanner;

public class DiaMesAno {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int totalDias, mesesCalculados, anosCalculados;
		
		System.out.println("Digite os dias");
		totalDias = leitor.nextInt();
		
		mesesCalculados = totalDias / 30;
		anosCalculados = totalDias / 365;
		
		System.out.println("Meses: " + mesesCalculados + " Anos: " + anosCalculados);

	leitor.close();
	}

}
