package main;

import java.util.ArrayList;

import entity.Produto;
import io.GsonProduto;

public class GsonMean {

	public static void main(String[] args) {
		
		try {
			GsonProduto json = new GsonProduto();

			Produto p1 = new Produto(1, "Iphone", 350.);
			Produto p2 = new Produto(2, "Xiaomi", 490.);
			Produto p3 = new Produto(3, "Asus", 350.);
			Produto p4 = new Produto(4, "Nokia", 150.);

			ArrayList<Produto> lista = new ArrayList<Produto>();
			lista.add(p1);
			lista.add(p2);
			lista.add(p3);
			lista.add(p4);

			json.open();
			json.create(lista);
			json.close();
			System.out.println("Dados Gravados!");
		} catch (Exception ex) {
			System.out.println("Error :" + ex.getMessage());
		}

	}

}
