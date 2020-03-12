package io;

import java.util.List;
import entity.Produto;

public interface IGsonProduto {
	
	public void open() throws Exception;
	
	public void create(List<Produto> produtos)throws Exception;

	public void close() throws Exception;
	
}
