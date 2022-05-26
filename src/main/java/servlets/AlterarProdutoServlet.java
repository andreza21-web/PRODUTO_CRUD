package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Product.Produto;
import Product.Produtos;

@WebServlet("/AlterarProduto")
public class AlterarProdutoServlet extends HttpServlet {

	// andreza do nascimento pessoa
	//lidiane souza soares
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		long id = Long.parseLong(req.getParameter("id"));
		System.out.println(id);
		String nome = req.getParameter("nome");
		int unidadeCompra = Integer.parseInt(req.getParameter("unidadeCompra"));
		String descricao = req.getParameter("descricao");
		double qtdPrevistoMes = Double.parseDouble(req.getParameter("qtdPrevistoMes"));
		double precoMaxComprado = Double.parseDouble(req.getParameter("precoMaxComprado"));

		Produtos produto = new Produtos();
		
		Produto produtoId = produto.buscarProduto(id);
		
		produtoId.setNome(nome);
		produtoId.setUnidadeCompra(unidadeCompra);
		produtoId.setDescricao(descricao);
		produtoId.setQtdPrevistoMes(qtdPrevistoMes);
		produtoId.setPrecoMaxComprado(precoMaxComprado);

		resp.sendRedirect("listarProduto");

	}

}
