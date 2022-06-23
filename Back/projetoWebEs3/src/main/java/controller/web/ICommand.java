
package controller.web;

import model.EntidadeDominio;
import model.Resultado;

public interface ICommand {
	
    public Resultado executar(EntidadeDominio entidade);
    
}
