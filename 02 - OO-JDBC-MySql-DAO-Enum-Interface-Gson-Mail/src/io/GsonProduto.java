package io;

import java.io.FileWriter;
import java.util.List;

import com.google.gson.Gson;

import entity.Produto;

public class GsonProduto implements IGsonProduto{
	
	FileWriter writer;
	
	@Override
	public void open() throws Exception {
		  writer = new FileWriter("C:\\Users\\hugo.lopes\\Desktop\\outros\\tmp\\listaProduto.json", false); //O false sobrescreve sempre, o true não.
	}

	@Override
	public void create(List<Produto> produtos) throws Exception {
		 writer.write(new Gson().toJson(produtos)); //grava e Atualiza
		 writer.flush(); //atualizar
	}

	@Override
	public void close() throws Exception {
        writer.close(); //fechar o Arquivo...		
	}


}
