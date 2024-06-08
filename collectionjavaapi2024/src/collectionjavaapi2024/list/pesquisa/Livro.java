package collectionjavaapi2024.list.pesquisa;

import java.util.Date;

public class Livro {

	private String titulo;
	private String autor;
	private int dataPublicacao;
	
	public Livro(String titulo, String autor, int dataPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getDataPublicacao() {
		return dataPublicacao;
	}

	@Override
	public String toString() {
		return "Livro"+
				" [Titulo: " + titulo +'\''+
				"Autor: " + autor +'\''+
				"dataPublicacao=" + dataPublicacao;
	}
	
	
	
}
