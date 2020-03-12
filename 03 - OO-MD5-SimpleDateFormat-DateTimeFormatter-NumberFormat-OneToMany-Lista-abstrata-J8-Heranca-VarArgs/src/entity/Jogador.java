package entity;

public class Jogador {
	// Elevar a logica ...

	private Integer id;
	private String nome;
	private Integer ponto = 0;

	// ponto maximo serao 30 ... 3 x jogadas ...
	// ganha quem tiver mais pontos ...
	public Jogador() {
	}

	public Jogador(Integer id, String nome, Integer ponto) {
		this.id = id;
		this.nome = nome;
		this.ponto = ponto;
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", nome=" + nome + ", ponto=" + ponto + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPonto() {
		return ponto;
	}

	public void setPonto(Integer ponto) {
		this.ponto = ponto;
	}

	public void gerarPontos() {
		this.setPonto(this.getPonto() + ((int) (Math.random() * 31)));
	}

	public Jogador jogar(Jogador jo) {
		Jogador j[] = new Jogador[3];
		for (int i = 0; i < 3; i++) {
			j[i] = new Jogador(jo.getId(), jo.getNome(), 0);
			j[i].gerarPontos();
			System.out.println(j[i]); // imprime a jogado
			jo.setPonto(jo.getPonto() + j[i].getPonto());
			System.out.println(jo.getPonto());
		}
		return jo;
	}

	public static void main(String[] args) {

		Jogador j1 = new Jogador(10, "carlos", 0);
		System.out.println(j1.jogar(j1));
		System.out.println("---------------------");

		Jogador j2 = new Jogador(11, "beira", 0);
		System.out.println(j2.jogar(j2));

//		  Jogador j2 =new Jogador(11,"jose",0);
//		  
//		  j1.gerarPontos();
//		  j2.gerarPontos();
//		  
//		  System.out.println(j1.getNome() + j1.getPonto());
//		  
//		  System.out.println(j2.getNome() + j2.getPonto());
//		  
//		  

	}

}
