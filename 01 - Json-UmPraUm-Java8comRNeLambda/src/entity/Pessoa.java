package entity;

public class Pessoa {

	private Integer id;
	private String nome;

	public Pessoa() {

	}

	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
