package collectionjavaapi2024.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {  

	private List<Livro> livroList;

	public CatalogoLivros() {this.livroList = new ArrayList<>();}
	
	private void adicionarLivros(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarLivros(String autor) {
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
}
