package collectionjavaapi2024.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventoMap;
	
	public AgendaEventos() {
		this.eventoMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		//Evento evento = new Evento(nome, atracao);
		eventoMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;

		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
		
		for (Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O próximo evento: "+ proximoEvento+ " acontecerá na data "+proximaData);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();

		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 12), "Comemoração", "Dias dos Namorados");
		agendaEventos.adicionarEvento(LocalDate.of(2022, 6, 13), "Barzinho", "Som ao vivo");
		agendaEventos.adicionarEvento(LocalDate.of(2020, Month.DECEMBER, 20), "Comemoração", "Casamento");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 19), "Comemoração", "Aniversario do cachorro");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}
}
