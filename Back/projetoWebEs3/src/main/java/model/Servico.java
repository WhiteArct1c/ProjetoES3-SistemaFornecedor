
package model;

import java.util.Date;

public class Servico extends EntidadeDominio{
    private String codigo;
    private String descricao;
    private double preco;
    private Date dataInicio;
    private Fornecedor fornecedor; 
    
  
	public Servico() {
		super();
	}

	public Servico(String descricao, double preco, Date dataInicio, Fornecedor fornecedor) {
		super();
		this.descricao = descricao;
		this.preco = preco;
		this.dataInicio = dataInicio;
		this.fornecedor = fornecedor;
	}

	public Servico(String codigo, String descricao, double preco, Date dataInicio, Fornecedor fornecedor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.dataInicio = dataInicio;
		this.fornecedor = fornecedor;
	}

	public Servico(int id, String codigo, String descricao, double preco, Date dataInicio) {
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.dataInicio = dataInicio;
	}

	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}



	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}



    

}
