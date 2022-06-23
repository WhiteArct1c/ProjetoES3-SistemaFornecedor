
package model;

public class Telefone extends EntidadeDominio{
    private String ddd;
    private String numero;
    private String ddi;

    public Telefone() {
    }
    
    public Telefone(String ddd, String numero, String ddi) {
        this.ddd = ddd;
        this.numero = numero;
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    @Override
    public String toString() {
        return "Telefone{" + "ddd=" + ddd + ", numero=" + numero + ", ddi=" + ddi + '}';
    }
  
}
