package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cliente {
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("telefone")
    private String telefone;

    @JsonCreator
    public Cliente(
            @JsonProperty("nome") String nome,
            @JsonProperty("cpf") String cpf,
            @JsonProperty("telefone") String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    // Default constructor for Jackson
    public Cliente() {
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }

    @Override
    public String toString() {
        return "Cliente: " + nome + " (CPF: " + cpf + ", Tel: " + telefone + ")";
    }
}

