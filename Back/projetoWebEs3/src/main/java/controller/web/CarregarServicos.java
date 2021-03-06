package controller.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Resultado;
import model.Servico;


@WebServlet(urlPatterns = "/CarregarServicos")
public class CarregarServicos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ConsultarCommand cmd = new ConsultarCommand();
	private Resultado resultado = new Resultado();
	private Servico servico = new Servico();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		resultado = cmd.executar(servico);
		
		if(resultado.getEntidades() != null && !resultado.getEntidades().isEmpty()) {
			request.setAttribute("servicos", resultado.getEntidades());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/servicos.jsp");
		rd.forward(request, response);		
	}

}
