package switchCase;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcaoContinuar = 0, dia, mes, ano;
		
		do {
			
			System.out.println("digite o dia");
			dia = entrada.nextInt();
			System.out.println("digite o mês");
			mes = entrada.nextInt();
			System.out.println("digite o ano");
			ano = entrada.nextInt();
			
			switch (mes) {
			
				case 1:
				case 3:
				case 5:
				case 7:
				case 10:
				case 12:
					if (dia<31) {
						dia = dia+1;
					} else {
						dia = 1;
						mes = mes+1;
						if (mes>12) {
							mes = 1;
							ano = ano+1;		
						}
					}
					break;
				case 4:
				case 6:
				case 8:
				case 9:
				case 11:	
					if (dia<30) {
						dia = dia+1;
					} else {
						dia = 1;
						mes = mes+1;
					}
					break;
				case 2:
					if (ano % 4 ==0) {
						if (dia<29) {
							dia = dia+1;
						} else {
							dia = 1;
							mes = mes+1;
						}
					} else {
						if (dia<28) {
							dia = dia+1;
						} else {
							dia = 1;
							mes = mes+1;
						}
					}
			}
			
			System.out.println(dia+"/"+mes+"/"+ano);
			
			System.out.println("Deseja continuar? 1- Não 2- Sim ");
			opcaoContinuar = entrada.nextInt();
		} while (opcaoContinuar > 1);
		
		
		entrada.close();
	}

}
