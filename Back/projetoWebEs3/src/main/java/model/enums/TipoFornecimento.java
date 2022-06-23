
package model.enums;

public enum TipoFornecimento {
    VENDA("Venda"),
    SERVICO("Serviço");
    
    private String descricao;
    
    TipoFornecimento(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
        
}
