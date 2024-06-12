package collectionjavaapi2024.map.Ordenacao;

public class Evento {

	private String nome;
	private String atracao;

	public Evento(String nome, String atracao) {
		super();
		this.nome = nome;
		this.atracao = atracao;
	}

	public String getNome() {
		return nome;
	}

	public String getAtracao() {
		return atracao;
	}

	@Override
	public String toString() {
		return "Evento Nome: " + nome + ", Atracao: " + atracao + "\n";
	}
}
