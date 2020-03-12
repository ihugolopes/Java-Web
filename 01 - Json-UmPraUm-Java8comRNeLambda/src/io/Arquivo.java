package io;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

import entity.Cliente;
/*
 * CLASSE TRABALHANDO COM JSON, RECEBENDO ARRAYLIST E GERANDO JSON.
 */

public class Arquivo implements IArquivo {

	FileWriter fw;

	@Override
	public void open() throws Exception {
		fw = new FileWriter("C:\\Users\\hugo.lopes\\Desktop\\outros\\clientes.json", false);
	}

	@Override
	public void writeJson(List<Cliente> clientes) throws Exception {
		JSONArray json = new JSONArray(clientes);
		fw.write(json.toString());
		fw.flush();
	}

	@Override
	public void close() throws Exception {
		fw.close();

	}
	
	public static void main(String[] args) {
		List<Cliente> lc = new ArrayList<>();
		Arquivo arq = new Arquivo();
		
		Cliente c1 = new Cliente(10, "teste1", "teste1@gmail.com");
		Cliente c2 = new Cliente(10, "teste2", "teste2@gmail.com");
		Cliente c3 = new Cliente(10, "teste3", "teste3@gmail.com");
		System.out.println("Cliente: " + c1);
		
		lc.add(c1);
		lc.add(c2);
		lc.add(c3);
				
		System.out.println("Gerando Json...");
		try {
			arq.open();
			arq.writeJson(lc);
			arq.close();
		} catch (Exception e) {
			System.out.println("Erro ao gerar Json: " + e.getMessage());
		}
		System.out.println("----------Json gerado!-------------");
	}

}
