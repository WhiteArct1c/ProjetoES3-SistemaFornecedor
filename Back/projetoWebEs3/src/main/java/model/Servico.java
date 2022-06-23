
package model;

public class Servico extends EntidadeDominio{
    private String nome;
    private String descricao;
    private double preco;
    
    public Servico() {
    	
    }

    public Servico(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public Servico(int id, String nome, String descricao, double preco) {
        this.id = id;
    	this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "Servico{" + "nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + '}';
    } 
}
