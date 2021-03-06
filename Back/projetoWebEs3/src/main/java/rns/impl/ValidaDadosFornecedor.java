package rns.impl;

import model.EntidadeDominio;
import model.Fornecedor;
import rns.IStrategy;

public class ValidaDadosFornecedor implements IStrategy{

    @Override
    public String  processar(EntidadeDominio entidade) {
    	Fornecedor fornecedor = (Fornecedor)entidade;
        
        StringBuilder sb = new StringBuilder();
        
        if(fornecedor.getCnpj() == null || fornecedor.getCnpj().isBlank()){
        	sb.append("É obrigatório cadastrar o CNPJ do Fornecedor!\n");
        }
        
        if(fornecedor.getRazaoSocial() == null || fornecedor.getRazaoSocial().isBlank()){
        	sb.append("É obrigatório informar a razão social do fornecedor!\n");
        }
        
        if(sb.length() != 0) {
        	return sb.toString();
        }   
        return null; 
	}
}
    

