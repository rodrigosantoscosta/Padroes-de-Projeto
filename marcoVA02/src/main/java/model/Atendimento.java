package model;

public class Atendimento {
    private int id;
    private Cliente cliente;
    private Veiculo veiculo;
    private String tipoServico;
    private String status;

    public Atendimento(int id, Cliente cliente, Veiculo veiculo, String tipoServico) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.tipoServico = tipoServico;
        this.status = "PENDENTE";
    }

    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public Veiculo getVeiculo() { return veiculo; }
    public String getTipoServico() { return tipoServico; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Atendimento #" + id + " - " + tipoServico +
                "\n  " + cliente +
                "\n  " + veiculo +
                "\n  Status: " + status;
    }
}
