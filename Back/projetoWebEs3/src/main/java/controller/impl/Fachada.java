package controller.impl;

import model.*;
import daodb.impl.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import controller.IFachada;
import daodb.IDAO;
import rns.IStrategy;
import rns.impl.ValidaCNPJ;
import rns.impl.ValidaDadosFornecedor;
import rns.impl.ValidaDadosProduto;
import rns.impl.ValidaDadosServico;

public class Fachada implements IFachada{
	private Map<String, IDAO> daos = new HashMap<String, IDAO>();
	private Map<String, List<IStrategy>> rns = new HashMap<String, List<IStrategy>>();
	private Resultado resultado = new Resultado();
	
	
	public Fachada() {
		
		String nmServico =  Servico.class.getName();
		String nmProduto = Produto.class.getName();
		String nmFornecedor = Fornecedor.class.getName();
		
		daos.put(nmServico, new ServicoDAO());
		daos.put(nmProduto, new ProdutoDAO());
		daos.put(nmFornecedor, new FornecedorDAO());
			
		List<IStrategy> rnsServico = new ArrayList<>();
		rnsServico.add(new ValidaDadosServico());
		
		List<IStrategy> rnsProduto = new ArrayList<>();
		rnsProduto.add(new ValidaDadosProduto());
		
		List<IStrategy> rnsFornecedor = new ArrayList<>();
		rnsFornecedor.add(new ValidaDadosFornecedor());
		rnsFornecedor.add(new ValidaCNPJ());
	
		rns.put(nmServico, rnsServico);
		rns.put(nmProduto, rnsProduto);
		rns.put(nmFornecedor, rnsFornecedor);

	}


	@Override
	public Resultado salvar(EntidadeDominio entidade) {
		StringBuilder sb = new StringBuilder();
		String nmEntidade = entidade.getClass().getName();
		List<IStrategy> regras  = rns.get(nmEntidade);
		
		for(IStrategy s: regras) {
			String msg = s.processar(entidade);
			if(msg != null && !msg.isBlank()){
				sb.append(msg);
				sb.append("\n");
			}
		}
		
		if(sb.length() == 0) {
			IDAO dao = daos.get(nmEntidade);
			resultado.setResposta(dao.salvar(entidade));
		}else {
			resultado.setResposta(sb.toString());
		}
		
		return resultado;			
	}


	@Override
	public Resultado alterar(EntidadeDominio entidade) {
		StringBuilder sb = new StringBuilder();
		String nmEntidade = entidade.getClass().getName();
		List<IStrategy> regras  = rns.get(nmEntidade);
		
		for(IStrategy s: regras) {
			String msg = s.processar(entidade);
			if(msg != null && !msg.isBlank()){
				sb.append(msg);
				sb.append("\n");
			}
		}
		
		if(sb.length() == 0) {
			IDAO dao = daos.get(nmEntidade);
			resultado.setResposta(dao.alterar(entidade));
		}else {
			resultado.setResposta(sb.toString());
		}		
		return resultado;
	}


	@Override
	public Resultado excluir(EntidadeDominio entidade) {
		String nmEntidade = entidade.getClass().getName();
		String mensagem = daos.get(nmEntidade).excluir(entidade);
		
		if(mensagem != null) {
			resultado.setResposta(mensagem);
		}
		
		return resultado;
	}


	@Override
	public Resultado consultar(EntidadeDominio entidade) {
		String nmEntidade = entidade.getClass().getName();
		List<EntidadeDominio> lista = daos.get(nmEntidade).consultar();
		Resultado resultado = new Resultado();
		
		resultado.setEntidades(lista);
		
		return resultado;
	}
	
}
