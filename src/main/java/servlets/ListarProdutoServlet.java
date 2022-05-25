package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Product.Produto;
import Product.Produtos;

@WebServlet("/listarProduto")
public class ListarProdutoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		Produtos prod = new Produtos();
		List <Produto> produtos = prod.listarProdutos();
		
		req.setAttribute("produtos",produtos);

		RequestDispatcher rd = req.getRequestDispatcher("/listarProduto.jsp");
		rd.forward(req, resp);;

	}

}
