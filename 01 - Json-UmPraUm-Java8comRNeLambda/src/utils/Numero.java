package utils;

public class Numero {

	private Double numero1;
	private Double numero2;
	private Double resposta;

	public Numero() {

	}

	public Numero(Double numero1, Double numero2, Double resposta) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.resposta = resposta;
	}

	@Override
	public String toString() {
		return "Numero [numero1=" + numero1 + ", numero2=" + numero2 + ", resposta=" + resposta + "]";
	}

	public Double getNumero1() {
		return numero1;
	}

	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}

	public Double getNumero2() {
		return numero2;
	}

	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}

	public Double getResposta() {
		return resposta;
	}

	public void setResposta(Double resposta) {
		this.resposta = resposta;
	}

}
