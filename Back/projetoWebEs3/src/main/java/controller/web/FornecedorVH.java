
package controller.web;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.EntidadeDominio;
import model.Fornecedor;

public class FornecedorVH implements IViewHelper{
	
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		int idFornecedor = 0;
		
		if(request.getParameter("idFornecedor") != null) {
			idFornecedor= Integer.parseInt(request.getParameter("idFornecedor"));
		}
					
		Fornecedor fornecedor = new Fornecedor(idFornecedor, request.getParameter("cnpjFornecedor"), 
				request.getParameter("razaosocialFornecedor"), request.getParameter("emailFornecedor"));
		
		return fornecedor;
	}

	@Override
	public void setEntidade(HttpServletResponse response, HttpServletRequest request, Object msg) throws IOException {
		response.sendRedirect(request.getContextPath() + "/CarregarFornecedores");
		//Object msg, que na verdade será do tipo Resultado (retorno), ainda não foi implementado para retornar ao front.
	}
    
}
