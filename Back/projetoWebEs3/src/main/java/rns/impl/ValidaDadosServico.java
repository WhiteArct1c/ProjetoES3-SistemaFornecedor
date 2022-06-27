package rns.impl;

import model.EntidadeDominio;
import model.Servico;
import rns.IStrategy;

public class ValidaDadosServico implements IStrategy{

    @Override
    public String processar(EntidadeDominio entidade) {
        
    	Servico servico = (Servico)entidade;
        
        StringBuilder sb = new StringBuilder();
        
        if(servico.getDescricao() == null || servico.getDescricao().isBlank()){
        	sb.append("É obrigatório cadastrar a descrição do serviço!\n");
        }
        
        if(servico.getPreco() <= 0){
        	sb.append("É obrigatório informar um preço ao produto!\n");
        }
        
        if(sb.length() != 0) {
        	return sb.toString();
        }
        
        return null;      
    }
    
}
