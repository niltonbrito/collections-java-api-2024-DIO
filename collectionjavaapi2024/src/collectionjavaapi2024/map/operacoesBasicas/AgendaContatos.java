package collectionjavaapi2024.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}

	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}

	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}

	public static void main(String[] args) {

		AgendaContatos agendaContatos = new AgendaContatos();

		agendaContatos.adicionarContato("Nilton", 123);
		agendaContatos.adicionarContato("Nilton", 1234);
		agendaContatos.adicionarContato("Nilton dos", 123456);
		agendaContatos.adicionarContato("Nilton Luiz", 1234567);
		agendaContatos.adicionarContato("Pedro Santos", 12345678);
		agendaContatos.adicionarContato("Nilton", 656545566);
		
		agendaContatos.exibirContato();
		
		agendaContatos.removerContato("Nilton Luiz");
		agendaContatos.exibirContato();
		
		System.out.println("O número é: "+agendaContatos.pesquisarPorNome("Nilton dos"));
	}
}
