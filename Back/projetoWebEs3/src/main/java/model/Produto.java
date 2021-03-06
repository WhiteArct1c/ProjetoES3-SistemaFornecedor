package model;

public class Produto extends EntidadeDominio {
    private String nome;
    private String categoria;
    private String tipoUnidade;
    private double preco;
    
    public Produto() {
    	
    }
    
    public Produto(int id, String nome, String categoria, String tipoUnidade, double preco) {
    	this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.tipoUnidade = tipoUnidade;
        this.preco = preco;
    }

    public Produto(String nome, String categoria, String tipoUnidade, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.tipoUnidade = tipoUnidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", categoria=" + categoria + ", tipoUnidade=" + tipoUnidade + ", preco=" + preco + '}';
    }
    
    
}
