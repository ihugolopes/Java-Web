package entity;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Correntista {

	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //Java 8 formatacao.

	static NumberFormat nf = NumberFormat.getCurrencyInstance();

	private Integer idCorrentista;
	private String nome;
	private Double saldo = 0.;
	public static LocalDateTime dataCadastro = LocalDateTime.now();
	private List<Movimentacao> movimentacoes; // OneToMany

	public Correntista() {
	}

	public Correntista(Integer idCorrentista, String nome, Double saldo) {
		super();
		this.idCorrentista = idCorrentista;
		this.nome = nome;
		this.saldo = saldo;
	}

	//Local que irei utilizar os formatadores de Data.
	@Override
	public String toString() {
		nf.setMaximumFractionDigits(2);
		nf.setMinimumIntegerDigits(2);
		
		return "Correntista - idCorrentista: " + idCorrentista + ", nome: " + nome + ", saldo: " + nf.format(saldo)
				+ ", dataCadastro: " + dtf.format(dataCadastro) + ".";
	}

	public Integer getIdCorrentista() {
		return idCorrentista;
	}

	public void setIdCorrentista(Integer idCorrentista) {
		this.idCorrentista = idCorrentista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public static LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public static void setDataCadastro(LocalDateTime dataCadastro) {
		Correntista.dataCadastro = dataCadastro;
	}

	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

	// Sobrecarga no Metodo Adicionar ...
	public void adicionar(Movimentacao m) {
		if (this.movimentacoes == null) {
			this.movimentacoes = new ArrayList<Movimentacao>();
		}
		this.movimentacoes.add(m);
	}

	// varargs
	public void adicionar(Movimentacao... m) {
		if (this.movimentacoes == null) {
			this.movimentacoes = new ArrayList<Movimentacao>();
		}
		this.movimentacoes.addAll(Arrays.asList(m));
	}

}
