package entity;

import java.text.SimpleDateFormat; // Java 7.
import java.util.Date; // Java 5.

public class Movimentacao {

	private Integer idMovimentacao;
	private String operacao;
	private Double valor;
	private Correntista correntista;
	public static Date data = new Date(); // java.util.*

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Movimentacao() {
	}

	// Conceito de agregacao para relacionar. É excelente para o relacionamento.
	public Movimentacao(Correntista correntista) {
		this.correntista = correntista;
	}

	// Associacao entre Classes.
	// Agregacao "Tecnico e time de Futebol".
	// Composicao "Estado, Cidade".
	@Override
	public String toString() {
		return "Movimentação - idMovimentacao: " + idMovimentacao + ", operacao: " + operacao + ", valor: " + valor
				+ ", data: " + sdf.format(data) + "\n";
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public static void setSdf(SimpleDateFormat sdf) {
		Movimentacao.sdf = sdf;
	}

	public Integer getIdMovimentacao() {
		return idMovimentacao;
	}

	public void setIdMovimentacao(Integer idMovimentacao) {
		this.idMovimentacao = idMovimentacao;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

	public void gerarDeposito() {
		if (this.operacao.equals("deposito")) {
			this.correntista.setSaldo(this.getValor() + this.correntista.getSaldo());
		}
	}

	// Sobrecarga de metodo, Agregacao, Data, Formatacao de Data.
	// OneToMany, Varargs.

	public void gerarRetirada() {
		if (this.operacao.equals("retirada")) {
			if (this.getValor() <= this.correntista.getSaldo()) {
				this.correntista.setSaldo(this.correntista.getSaldo() - this.getValor());
			} else {
				throw new IllegalArgumentException("Nao ha limite para a Retirada.");
			}
		}
	}

	public static void main(String[] args) {
		
		Correntista c = new Correntista(1001, "Fulano da Silva", 2000.);
		
		// agregacao do correntista a movimentacao nas 3 movimentacoes.
		Movimentacao m1 = new Movimentacao(c); //Movimentacoes tem correntista.
			m1.setIdMovimentacao(1);
			m1.setOperacao("deposito");
			m1.setValor(5000.);
			m1.gerarDeposito();
			
		Movimentacao m2 = new Movimentacao(c); 
			m2.setIdMovimentacao(2);
			m2.setOperacao("retirada");
			m2.setValor(1500.);
			m2.gerarRetirada();
			
		Movimentacao m3 = new Movimentacao(c);
			m3.setIdMovimentacao(3);
			m3.setOperacao("retirada");
			m3.setValor(5400.);
			m3.gerarRetirada();
			
		c.adicionar(m1, m2, m3); //Recebendo diversas movimentacoes. "VarArgs". Correntista tem as movimentacoes.
		
		
		System.out.println(c);
		System.out.println("");
		System.out.println(c.getMovimentacoes());//Buscar movimentacoes no correntista.
		System.out.println("");
		System.out.println(m1.getCorrentista() + "\n" + m1); //Buscar correntista na movimentacao.
	}

}
