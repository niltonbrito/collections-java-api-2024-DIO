package collectionjavaapi2024.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	private List<Pessoa> pessoaList;

	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	private void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));

	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

		ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 25, 1.70);
		ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);
		
		System.out.println(ordenacaoPessoa.pessoaList);
		
		System.out.println(ordenacaoPessoa.ordenarPorIdade());		
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
	}
}
