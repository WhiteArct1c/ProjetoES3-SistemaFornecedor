package controller.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.EntidadeDominio;
import model.Resultado;

@WebServlet(urlPatterns = "/controller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Map<String, ICommand> cmds = new HashMap<String, ICommand>();

    public ControllerServlet() {
   	
    	cmds.put("Salvar", new SalvarCommand());  	
    	cmds.put("Alterar", new AlterarCommand());
    	cmds.put("Excluir", new ExcluirCommand());
    	cmds.put("Consultar", new ConsultarCommand()); // para implementar o consultar por filtro
    	
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
				
		String acao = request.getParameter("acao");
		String nomeVH = request.getParameter("viewHelper");
	
		try {
			String viewHelper = "controller.web." + nomeVH;
			Class classe = Class.forName(viewHelper);
			IViewHelper iViewHelper = (IViewHelper) classe.getDeclaredConstructor().newInstance();
			
			ICommand command = cmds.get(acao);
			EntidadeDominio entidade = iViewHelper.getEntidade(request);
			
			Resultado retorno = command.executar(entidade);
			
			
			iViewHelper.setEntidade(response, request, retorno);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
