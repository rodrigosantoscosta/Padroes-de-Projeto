package factory;

import model.Cliente;
import model.Veiculo;

// Fábrica para documentos internacionais
public class DocumentoInternacionalFactory implements DocumentoFactory {
    @Override
    public Cliente criarCliente(String nome, String passaporte, String telefone) {
        System.out.println("Criando cliente com passaporte internacional");
        return new Cliente(nome, passaporte, telefone);
    }

    @Override
    public Veiculo criarVeiculo(String placa, String modelo, String marca) {
        System.out.println("Criando veículo com placa internacional");
        return new Veiculo(placa, modelo, marca);
    }
}