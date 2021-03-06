
package model;

import java.util.ArrayList;
import java.util.List;
import model.enums.TipoFornecimento;

public class Fornecedor extends EntidadeDominio{
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private String cnae;
    private String email;
    private boolean status;
    private TipoFornecimento tpFornecimento;
    private Endereco endereco;
    
    private List<Contato> contatos = new ArrayList<>();
    private List<Telefone> telefones = new ArrayList<>();

    public Fornecedor() {
    	
    }
    
    public Fornecedor(int id, String cnpj, String razaoSocial, String email) {
		this.id = id;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.email = email;
	}

	public Fornecedor(String cnpj, String razaoSocial, String nomeFantasia, String inscricaoEstadual, String inscricaoMunicipal, 
            String cnae, String email, TipoFornecimento tpFornecimento, Endereco endereco, List<Telefone> telefones) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.cnae = cnae;
        this.email = email;
        this.tpFornecimento = tpFornecimento;
        this.endereco = endereco;
        this.status = true;
        this.telefones.addAll(telefones);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TipoFornecimento getTpFornecimento() {
        return tpFornecimento;
    }

    public void setTpFornecimento(TipoFornecimento tpFornecimento) {
        this.tpFornecimento = tpFornecimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + 
                ", nomeFantasia=" + nomeFantasia + ", inscricaoEstadual=" + inscricaoEstadual + 
                ", inscricaoMunicipal=" + inscricaoMunicipal + ", cnae=" + cnae + 
                ", email=" + email + ", status=" + status + 
                ", tpFornecimento=" + tpFornecimento + ", endereco=" + endereco + 
                ", contatos=" + contatos + ", telefones=" + telefones + '}';
    } 
}
