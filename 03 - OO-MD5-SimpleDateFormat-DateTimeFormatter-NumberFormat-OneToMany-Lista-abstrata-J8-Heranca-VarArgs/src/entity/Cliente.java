package entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	
	private Integer idCliente;
	private String nome;
	private String email;
	private String senha;
	private String perfil;
	protected List<Produto> produtos = new ArrayList<Produto>();

	public Cliente() {
	}

	public abstract List<Produto> getProdutos();

	private void init() {
		produtos.add(new Produto(1, "havaianas", 70.));
		produtos.add(new Produto(2, "calca", 140.));
		produtos.add(new Produto(3, "camisa", 50.));
	}

	public Cliente(Integer idCliente, String nome, String email, String senha, String perfil) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
		if (this.perfil.equals("usu")) {
			this.produtos = null;
		} else if (this.perfil.equals("adm")) {
			init();
		}
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", senha=" + senha
				+ ", perfil=" + perfil + "]";
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}
