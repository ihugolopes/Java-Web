package entity;

import java.util.List;

public class ClienteEspecial extends Cliente {

	static String meuperfil = "adm";

	public ClienteEspecial(Integer idCliente, String nome, String email, String senha, String perfil) {
		super(idCliente, nome, email, senha, meuperfil);
	}

	@Override
	public List<Produto> getProdutos() {
		if (this.produtos == null) {
			System.out.println("Produtos não acessíveis para consulta");
		}
		return this.produtos;
	}

}
