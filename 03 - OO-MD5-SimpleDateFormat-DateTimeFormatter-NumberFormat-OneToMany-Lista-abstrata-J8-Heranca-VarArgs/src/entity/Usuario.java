package entity;

import org.jcommon.encryption.SimpleMD5;

public class Usuario {

	private Integer id;
	private String nome;
	private String senha;
	private String email;

	// vazio (set) sobrecarga ...
	public Usuario() {
	}

	public Usuario(Integer id, String nome, String senha, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", senha=" + senha + ", email=" + email + "]";
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void gerarSenha() {
		String chave = "www.testando.com.br;testandom@gmail.com";
		SimpleMD5 md5 = new SimpleMD5(getSenha(), chave);

		setSenha(md5.toHexString());
	}

	public static void main(String[] args) {
		Usuario u = new Usuario(10, "teste", "123", "teste@gmail.com");
		u.gerarSenha();
		System.out.println(u);
		System.out.println("Senha MD5: " + u.getSenha());
	}

}
