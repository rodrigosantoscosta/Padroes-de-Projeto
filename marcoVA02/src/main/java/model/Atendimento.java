package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Atendimento {
    @JsonProperty("id")
    private int id;
    @JsonProperty("cliente")
    private Cliente cliente;
    @JsonProperty("veiculo")
    private Veiculo veiculo;
    @JsonProperty("tipoServico")
    private String tipoServico;
    @JsonProperty("status")
    private String status;

    @JsonCreator
    public Atendimento(
            @JsonProperty("id") int id,
            @JsonProperty("cliente") Cliente cliente,
            @JsonProperty("veiculo") Veiculo veiculo,
            @JsonProperty("tipoServico") String tipoServico) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.tipoServico = tipoServico;
        this.status = "PENDENTE";
    }

    // Construtor para o Jackson
    public Atendimento() {
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
