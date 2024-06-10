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
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);		
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		for (Contato contato : contatoSet) {
			if (contato.getNome().startsWith(nome)) {
				contatosPorNome.add(contato);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato contato : contatoSet) {
			if (contato.getNome().equalsIgnoreCase(nome)) {
				contato.setNumero(novoNumero);
				contatoAtualizado = contato;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();

		agendaContatos.adicionarContatos("Nilton Brito", 1245);
		agendaContatos.adicionarContatos("Nilton Luiz", 1247);
		agendaContatos.adicionarContatos("Nilton Santos", 1295);
		agendaContatos.adicionarContatos("Nilton Dos", 1005);
		agendaContatos.adicionarContatos("Jamile Sena", 877450);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Nilton"));
		
		System.out.println("Contato atualizado: "+agendaContatos.atualizarNumeroContato("Jamile Sena", 871111111));
		agendaContatos.exibirContatos();
	}
}
