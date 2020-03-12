package persistence;

import entity.Cliente;

public class ClienteDao extends Dao {

	public void create(Cliente e) throws Exception {
		String nome = e.getNome().trim();
		nome = nome.replaceAll("'", "");
		nome = nome.replaceAll(";", "");

		open();
		stmt = con.prepareStatement("insert into cliente values (?,?,?,?,?) ");
		stmt.setInt(1, e.getIdCliente());
		stmt.setString(2, nome);
		stmt.setString(3, e.getEmail());
		stmt.setDouble(4, e.getValor());
		stmt.setString(5, e.getPlano());
		stmt.execute();
		stmt.close();
		close();
	}

	public static void main(String[] args) {
		try {
			Cliente x = new Cliente(10002, " ;'nos  ", "nos@gmail.com", 250., "PlanoA");
			ClienteDao dao = new ClienteDao();
			dao.create(x);
			System.out.println("ok");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
