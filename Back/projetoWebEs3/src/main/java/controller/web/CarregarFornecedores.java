package controller.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Fornecedor;
import model.Resultado;

/**
 * Servlet implementation class CarregarFornecedores
 */
@WebServlet("/CarregarFornecedores")
public class CarregarFornecedores extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ConsultarCommand cmd = new ConsultarCommand();
	private Resultado resultado = new Resultado();
	private Fornecedor fornecedor = new Fornecedor();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		resultado = cmd.executar(fornecedor);
		
		if(resultado.getEntidades() != null && !resultado.getEntidades().isEmpty()) {
			request.setAttribute("fornecedores", resultado.getEntidades());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/fornecedores.jsp");
		rd.forward(request, response);		
	}
}
