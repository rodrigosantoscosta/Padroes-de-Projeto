package auxs;

public class Telefone {
    private String codigoPais;
    private String ddd;
    private String numero;
    private String tipo;  // Ex: Celular, Residencial, Comercial

    public Telefone(String codigoPais, String ddd, String numero, String tipo) {
        this.codigoPais = codigoPais;
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    // Getters
    public String getCodigoPais() {
        return codigoPais;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    // Setters
    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Exibir telefone formatado
    public void exibirTelefone() {
        System.out.println(tipo + ": +" + codigoPais + " (" + ddd + ") " + numero);
    }

    @Override
    public String toString() {
        return "+" + codigoPais + " (" + ddd + ") " + numero + " [" + tipo + "]";
    }
}
