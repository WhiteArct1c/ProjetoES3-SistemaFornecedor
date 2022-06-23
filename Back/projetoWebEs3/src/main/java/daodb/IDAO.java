package daodb;

import java.util.List;
import model.EntidadeDominio;

public interface IDAO {
    
    public String salvar(EntidadeDominio entidade);

    public String alterar(EntidadeDominio entidade);

    public String excluir(EntidadeDominio entidade);

    public <T extends EntidadeDominio> List<T> consultar();
}
