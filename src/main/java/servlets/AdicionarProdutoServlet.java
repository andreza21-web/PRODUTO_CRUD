package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Product.Produto;
import Product.Produtos;

//andreza do nascimento pessoa
//lidiane souza soares

@WebServlet("/AdicionarProdutoServlet")
public class AdicionarProdutoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		int unidadeCompra = Integer.parseInt(req.getParameter("unidadeCompra"));
		String descricao = req.getParameter("descricao");
		double qtdPrevistoMes = Double.parseDouble(req.getParameter("qtdPrevistoMes"));
		double precoMaxComprado = Double.parseDouble(req.getParameter("precoMaxComprado"));

		Produto produto = new Produto();
		System.out.println(produto);
		

		produto.setNome(nome);
		produto.setUnidadeCompra(unidadeCompra);
		produto.setDescricao(descricao);
		produto.setQtdPrevistoMes(qtdPrevistoMes);
		produto.setPrecoMaxComprado(precoMaxComprado);

		new Produtos().adiciona(produto);
		System.out.println(produto);
		
		req.setAttribute("produto", produto.getNome());
		resp.sendRedirect("listarProduto");

	}

}
