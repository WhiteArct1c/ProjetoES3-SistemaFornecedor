package controller.web;

import model.EntidadeDominio;
import model.Resultado;

public class SalvarCommand extends AbstractCommand{

	@Override
	public Resultado executar(EntidadeDominio entidade) {
		return fachada.salvar(entidade);
	}

}
