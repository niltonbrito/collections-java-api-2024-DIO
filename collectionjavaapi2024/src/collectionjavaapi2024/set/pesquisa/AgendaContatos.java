package collectionjavaapi2024.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatoSet;
	
	
	public AgendaContatos() {
		super();
		this.contatoSet = new HashSet<>();
	}


	public void adicionarContatos(String nome, int numero) {
		contatoSet.add(new Contato("Nilton Brito", 992046500));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);		
	}
	
	//public String pesquisarPorNome(String nome) {
		
	//}
}
