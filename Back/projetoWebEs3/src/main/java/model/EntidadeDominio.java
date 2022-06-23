
package model;

public class EntidadeDominio {
    protected int id;
    protected Long dtCadastro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Long dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    @Override
    public String toString() {
        return "EntidadeDominio{" + "id=" + id + ", dtCadastro=" + dtCadastro + '}';
    }
    
}
