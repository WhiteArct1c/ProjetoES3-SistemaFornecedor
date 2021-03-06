package controller.web;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Produto;
import model.Resultado;

/**
 * Servlet implementation class CarregarProdutos
 */
@WebServlet(urlPatterns = "/CarregarProdutos")
public class CarregarProdutos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ConsultarCommand cmd = new ConsultarCommand();
	private Resultado resultado = new Resultado();
	private Produto produto = new Produto();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		resultado = cmd.executar(produto);
		
		if(resultado.getEntidades() != null && !resultado.getEntidades().isEmpty()) {
			request.setAttribute("produtos", resultado.getEntidades());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/produtos.jsp");
		rd.forward(request, response);		
	}

}
