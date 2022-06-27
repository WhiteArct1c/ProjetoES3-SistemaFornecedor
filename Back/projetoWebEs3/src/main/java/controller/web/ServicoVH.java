package controller.web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.EntidadeDominio;
import model.Servico;

public class ServicoVH implements IViewHelper {

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		
		SimpleDateFormat formatBrDate = new SimpleDateFormat("dd-MM-yyyy");
		
		int idServico = 0;
		double precoServico = 0.0;
		Date dataServico = null;
		
		if(request.getParameter("idServico") != null) {
			idServico = Integer.parseInt(request.getParameter("idServico"));
		}
		
		if(request.getParameter("precoServico") != null) {
			precoServico = Double.parseDouble(request.getParameter("precoServico"));
		}
		
		if(request.getParameter("dtinicioServico") != null) {
			try {
				dataServico = formatBrDate.parse(request.getParameter("dtinicioServico"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
			
		Servico servico = new Servico(idServico, request.getParameter("codigoServico"), 
				request.getParameter("descricaoServico"), precoServico, dataServico);
		
		return servico;
	}

	@Override
	public void setEntidade(HttpServletResponse response, HttpServletRequest request, Object msg) throws IOException {		
		response.sendRedirect(request.getContextPath() + "/CarregarServicos");
		//Object msg, que na verdade será do tipo Resultado (retorno), ainda não foi implementado para retornar ao front.
	}

}
