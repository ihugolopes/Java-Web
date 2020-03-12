package java8;

public class Calculo {

	public static IFuncional par = (a) -> (a % 2 == 0) ? "Par: " + a : "Ímpar: " + a;

	public static IFuncional positivo = (a) -> (a > 0) ? "Positivo: " + a : (a == 0) ? "Nulo: " + a : "Negativo: " + a;

	public static IFuncional dobro = (a) -> "Dobro: " + (a * 2);
	public static IFuncional triplo = (a) -> "Triplo: " + (a * 3);
	public static IFuncional metade = (a) -> "Metade: " + (a / 2);

	public static void main(String[] args) {

		System.out.println(Calculo.par.operacao(8));
		System.out.println(Calculo.par.operacao(9));
		System.out.println(Calculo.positivo.operacao(0));
		System.out.println(Calculo.positivo.operacao(1));
		System.out.println(Calculo.dobro.operacao(10));
		System.out.println(Calculo.metade.operacao(10));
		System.out.println(Calculo.triplo.operacao(10));

	}

}
