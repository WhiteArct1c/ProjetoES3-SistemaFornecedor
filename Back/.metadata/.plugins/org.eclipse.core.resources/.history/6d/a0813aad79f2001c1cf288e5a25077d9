package controller.web;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.EntidadeDominio;
import model.Produto;

public class ProdutoVH implements IViewHelper {

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		int idProduto = 0;
		double precoProduto = 0.0;
		
		if(request.getParameter("idProduto") != null) {
			idProduto= Integer.parseInt(request.getParameter("idProduto"));
		}
		
		if(request.getParameter("precoProduto") != null) {
			precoProduto = Double.parseDouble(request.getParameter("precoProduto"));
		}
			
		Produto produto = new Produto(idProduto, request.getParameter("nomeProduto"), 
				request.getParameter("categoriaProduto"), request.getParameter("tpUnidadeProduto"), precoProduto);
		
		return produto;
	}

	@Override
	public void setEntidade(HttpServletResponse response, HttpServletRequest request, Object msg) throws IOException {
		response.sendRedirect(request.getContextPath() + "/CarregarProdutos");
		
	}

}
