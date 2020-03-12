package entity;

public class Cliente {

	private Integer idCliente;
	private String nome;
	private String email;
	private String plano;
	private Double valor;

	public Cliente() {

	}

	public Cliente(Integer idCliente, String nome, String email, Double valor, String plano) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.plano = plano;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", plano=" + plano
				+ ", valor=" + valor + "]";
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
