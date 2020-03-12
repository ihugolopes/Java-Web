package type;

public enum TypePlanoCliente {

	PLANOA(459., "JAMIL"), PLANOB(390., "SILVERCROSS"), PLANOC(599., "NORTEAMERICA");

	private Double valor;
	private String plano;

	TypePlanoCliente(Double valor, String plano) {
		this.valor = valor;
		this.plano = plano;
	}

	public Double getValor() {
		return valor;
	}

	public String getPlano() {
		return plano;
	}

	public static void main(String[] args) {
		// nao de (new) _ jamais
		// Enum tipar especificar exatamente o servico que deseja.
		TypePlanoCliente type = PLANOA;

		System.out.println(type.getValor());
		System.out.println(type.getPlano());

	}

}
