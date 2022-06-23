package model;

import java.util.ArrayList;
import java.util.List;

public class OrdemServico extends EntidadeDominio{
    private Long prazo;
    private Long dtRequisicao;
    private Fornecedor fornecedor = new Fornecedor();
    private List<Servico> servicos = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    
    public OrdemServico() {
    	
    }
    
    public OrdemServico(Long prazo, Long dtRequisicao, Fornecedor fornecedor, List<Servico> servicos,
			List<Produto> produtos) {
		super();
		this.prazo = prazo;
		this.dtRequisicao = dtRequisicao;
		this.fornecedor = fornecedor;
		this.servicos = servicos;
		this.produtos = produtos;
	}
    
	public Long getPrazo() {
		return prazo;
	}
	
	public void setPrazo(Long prazo) {
		this.prazo = prazo;
	}
	
	public Long getDtRequisicao() {
		return dtRequisicao;
	}
	
	public void setDtRequisicao(Long dtRequisicao) {
		this.dtRequisicao = dtRequisicao;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public List<Servico> getServicos() {
		return servicos;
	}
	
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
    
   
}
