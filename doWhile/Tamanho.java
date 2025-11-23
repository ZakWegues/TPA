package DoWhile;

public class Tamanho {

	public static void main(String[] args) {
	
		double alturaJoao = 1.34, alturaPedro = 1.45, anosPassados = 0;
		
		alturaJoao = alturaJoao * 100;
		alturaPedro = alturaPedro * 100;
		
		do {
			alturaPedro = alturaPedro + 2;
			alturaJoao = alturaJoao + 2.5;
			anosPassados++;
		} while (alturaJoao < alturaPedro);
		
		System.out.println(anosPassados + " Anos");

	}

}
