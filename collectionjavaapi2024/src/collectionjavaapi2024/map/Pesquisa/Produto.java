package collectionjavaapi2024.map.Pesquisa;

public class Produto {

	private long cod;
	private String nome;
	private int quantidade;
	private double preco;

	public Produto(long cod, String nome, int quantidade, double preco) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public long getCod() {
		return cod;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Cod: " + cod + ", Nome: " + nome + ", Quantidade: " + quantidade + ", Preço: " + preco + "\n";
	}
}
