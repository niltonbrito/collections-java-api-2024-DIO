package collectionjavaapi2024.map.Pesquisa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		super();
		this.estoqueProdutosMap = new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(cod, nome, quantidade, preco));
	}

	public void exibirProduto() {
		System.out.println(estoqueProdutosMap);
	}

	public double calculaValorTotalEstoque() {
		double valorTotalEstoque = 0;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}

	public Produto obterProdutoMaisCaro() {

		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if (p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}

	public static void main(String[] args) {

		EstoqueProdutos estoqueProduto = new EstoqueProdutos();

		estoqueProduto.adicionarProduto(1L, "Produto A", 10, 5.0);
		estoqueProduto.adicionarProduto(2L, "Produto B", 5, 10.0);
		estoqueProduto.adicionarProduto(3L, "Produto C", 2, 15.0);

		estoqueProduto.exibirProduto();

		System.out.println("Valor total do estoque: R$ " + estoqueProduto.calculaValorTotalEstoque());
		System.out.println("Produto mais barato: " + estoqueProduto.obterProdutoMaisCaro());
	}
}
