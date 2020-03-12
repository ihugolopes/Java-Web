package io;

import java.util.List;

import entity.Cliente;

public interface IArquivo {
 
	public void open() throws Exception;
	
	public void writeJson(List<Cliente> clientes) throws Exception;
	
	 public void close() throws Exception;
	 
}


 