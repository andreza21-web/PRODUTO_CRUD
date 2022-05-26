package Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Produtos {
	// andreza do nascimento pessoa
	//lidiane souza soares
	
	private static List<Produto> lista = new ArrayList<Produto>();
	private static Integer chaveSequencial = 1;	

	public List<Produto> listarProdutos() {
		return this.lista;
	}
	
	public void adiciona(Produto produto) {
		adicionarProduto(produto);
	}

	private static void adicionarProduto(Produto produto) {
		produto.setId(chaveSequencial++);
		lista.add(produto);
	}
	
	public void remover(long id) {
		Iterator<Produto> iProdutos = lista.iterator();
		
		while(iProdutos.hasNext()) {
			Produto produto = iProdutos.next();
			
			if(produto.getId() == id) {
				iProdutos.remove();
			}
		}
	}
	
	public Produto buscarProduto(long id) {
		for(Produto produto : lista) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
	}


}
