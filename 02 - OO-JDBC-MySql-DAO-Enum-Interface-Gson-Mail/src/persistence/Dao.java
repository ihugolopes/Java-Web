package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//DAO - Data Access Object

public class Dao {

	Connection con; // Conectando ao Banco.
	PreparedStatement stmt; // Tabela.
	ResultSet rs; // Consulta aos Dados.

	public void open() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); //A partir do MySql 8 se adiciona o "cj".
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BD", "root", "senha");
	}

	public void close() throws Exception {
		con.close();
	}

}
