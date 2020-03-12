package java8;

public class CalcularFuncionalidades {

	public static ICalculoFuncional soma = (a, b) -> a + b;
	public static ICalculoFuncional subtracao = (a, b) -> a - b;
	public static ICalculoFuncional multiplicacao = (a, b) -> a * b;
	public static ICalculoFuncional divisao = (a, b) -> a / b;
	public static ICalculoFuncional exponenciacao = (a, b) -> Math.pow(a, b);
	
	public static ICalculoFuncional somar = (a, b) -> a + b;

	public static void main(String[] args) {
		
		double n1 = 100.;
		double n2 = 200.;

		double soma = CalcularFuncionalidades.soma.operacao(n1, n2);
		System.out.println("Soma de " + n1 + " + " + n2 + " = " + soma);

		System.out.println("Subtração de " + n1 + " - " + n2 + " = " + CalcularFuncionalidades.subtracao.operacao(10., 2.));

		System.out.println("Exponênciação de " + n1 + " ^ " + n2 + " = " + CalcularFuncionalidades.exponenciacao.operacao(3., 4.));
		
		System.out.println("Multiplicação de " + n1 + " * " + n2 + " = " + CalcularFuncionalidades.multiplicacao.operacao(n1, 2.));

	}

}
