package entity;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * CLASSE TRABALHANDO COM JSON.
 * IMPRIME OBJETOS EM STRING, JSON CONVERTIDO EM ARRAY E JSON SIMPLES.
*/
public class Cliente {

	private Integer id;
	private String nome;
	private String email;

	private JSONObject json;

	public Cliente() {
	}

	public Cliente(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "id, nome, email \n" + String.valueOf(this.id) + ", " + this.nome + ", " + this.email + " \n";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public JSONObject getJson() {
		return json;
	}

	public void setJson(JSONObject json) {
		this.json = json;
	}

	public void gerarJson() throws Exception {
		if (json == null) {
			json = new JSONObject();
		}
		json.put("id", getId());
		json.put("nome", getNome());
		json.put("email", getEmail());
	}

	public static void main(String[] args) {
		System.out.println("Imprime como String: ");
		Cliente c = new Cliente(10, "teste", "teste@gmail.com");
		System.out.println(c); // aqui imprime como String
		System.out.println("------------------------------");
		
		try {
			System.out.println("Converte em Vetor de Json, Array: ");
			
			JSONArray result = CDL.toJSONArray(c.toString()); // Aqui converte em Vetor de JSON []
			System.out.println(result);
			System.out.println("------------------------");
			
			
			System.out.println("Imprime Json Simples: "); // Aqui imprime como JSON SIMPLES {}
			c.gerarJson();
			System.out.println(c.getJson());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
