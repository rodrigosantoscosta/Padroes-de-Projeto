package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Veiculo {
    @JsonProperty("placa")
    private String placa;
    @JsonProperty("modelo")
    private String modelo;
    @JsonProperty("marca")
    private String marca;

    @JsonCreator
    public Veiculo(
            @JsonProperty("placa") String placa,
            @JsonProperty("modelo") String modelo,
            @JsonProperty("marca") String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Veículo: " + marca + " " + modelo + " (Placa: " + placa + ")";
    }
}