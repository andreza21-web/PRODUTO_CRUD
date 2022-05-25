package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Product.Produtos;

@WebServlet("/RemoveProduto")
public class RemoveProdutoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		long id = Long.parseLong(req.getParameter("id"));

		Produtos produto = new Produtos();

		produto.remover(id);

		resp.sendRedirect("listarProduto");
	}

}
