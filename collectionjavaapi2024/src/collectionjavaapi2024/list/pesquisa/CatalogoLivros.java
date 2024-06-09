package collectionjavaapi2024.list.pesquisa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogoLivros {  

	private List<Livro> livroList;

	public CatalogoLivros() {this.livroList = new ArrayList<>();}
	
	private void adicionarLivros(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervalos = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro livro : livrosPorIntervalos) {
				if (livro.getDataPublicacao() >= anoInicial && livro.getDataPublicacao() <= anoFinal) {
					livrosPorIntervalos.add(livro);
				}
			}
		}
		return livrosPorIntervalos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livrosPorTitulo = null;
		if (!livroList.isEmpty()) {
			for (Livro livro : livroList) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livrosPorTitulo = livro;
					break;
				}
			}
		}
		return livrosPorTitulo;
	}
	
	public static void main(String[] args) {
		
		CatalogoLivros catalogoLivros = new CatalogoLivros();

		catalogoLivros.adicionarLivros("Livro 1", "Nilton Brito", 2000);
		catalogoLivros.adicionarLivros("Livro 3", "Jamile", 2001);
		catalogoLivros.adicionarLivros("Livro 2", "Brito", 2002);
		catalogoLivros.adicionarLivros("Livro 4", "Anderson", 2003);
		catalogoLivros.adicionarLivros("Livro 4", "Pedro", 2004);

		System.out.println(catalogoLivros.pesquisarPorAutor("Nilton Brito"));		
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1999, 2024));		
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 4"));
	}
}
