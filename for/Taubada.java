package For;

public class Taubada {

	public static void main(String[] args) {
		
		int multiplicando=1, multiplicador=1, resultado;
		
		for (multiplicando=1; multiplicando<=10; multiplicando++) {
			for (multiplicador=1; multiplicador<=10; multiplicador++) {
				resultado = multiplicador*multiplicando;
				System.out.println(multiplicando+"x"+multiplicador+"= "+resultado);
			}
		}

	}

}
