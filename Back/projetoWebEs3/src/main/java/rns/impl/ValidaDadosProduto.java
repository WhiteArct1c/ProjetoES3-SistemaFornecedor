package rns.impl;

import model.EntidadeDominio;
import model.Produto;
import rns.IStrategy;

public class ValidaDadosProduto implements IStrategy {

	@Override
	public String processar(EntidadeDominio entidade) {
		Produto produto = (Produto)entidade;
        
        StringBuilder sb = new StringBuilder();
        
        if(produto.getNome() == null || produto.getNome().isBlank()){
        	sb.append("É obrigatório cadastrar o nome do produto!\n");
        }
        
        if(produto.getPreco() <= 0){
        	sb.append("É obrigatório informar um preço ao produto!\n");
        }
        
        if(sb.length() != 0) {
        	return sb.toString();
        }   
        return null; 
	}

}
