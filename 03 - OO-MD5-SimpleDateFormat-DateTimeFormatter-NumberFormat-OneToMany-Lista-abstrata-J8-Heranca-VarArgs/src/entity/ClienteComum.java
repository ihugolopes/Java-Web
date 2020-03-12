package entity;

import java.util.List;

public class ClienteComum extends Cliente {

	static String meuperfil = "usu";

	public ClienteComum(Integer idCliente, String nome, String email, String senha, String perfil) {
		super(idCliente, nome, email, senha, meuperfil);
	}

	@Override
	public List<Produto> getProdutos() {
		
		if (super.produtos == null) {
			System.out.println("Produtos: Não acessíveis para consulta!");
		} else {
			System.out.println("Produtos: " + super.produtos);
		}
		
		return this.produtos;
	}

	public static void main(String[] args) {
		
		System.out.println("---Cliente Especial---");
		ClienteEspecial ce = new ClienteEspecial(100, "teste1", "teste1@gmail.com", "123", "adm");

		System.out.println("Nome: " + ce.getNome());
		System.out.println("Perfil: " + ce.getPerfil());
		System.out.println("Produtos: " + ce.getProdutos());
		
		System.out.println("");
		System.out.println("---Cliente Comum---");
		ClienteComum cc = new ClienteComum(102, "teste2", "test2e@gmail.com", "123", "usu");

		System.out.println("Nome: " + cc.getNome());
		System.out.println("Perfil: " + cc.getPerfil());
		System.out.println(cc.getProdutos());

	}

}
