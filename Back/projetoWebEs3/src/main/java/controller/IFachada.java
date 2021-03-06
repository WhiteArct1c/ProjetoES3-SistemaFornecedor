
package controller;

import java.util.List;

import model.EntidadeDominio;
import model.Resultado;

public interface IFachada {
    
    public Resultado salvar(EntidadeDominio entidade);

    public Resultado alterar(EntidadeDominio entidade);

    public Resultado excluir(EntidadeDominio entidade);

    public Resultado consultar(EntidadeDominio entidade);
    
}
