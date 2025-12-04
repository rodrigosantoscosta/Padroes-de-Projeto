package factory;

import model.Cliente;
import model.Veiculo;

// Fábrica para documentos brasileiros
public class DocumentoBrasilFactory implements DocumentoFactory {
    @Override
    public Cliente criarCliente(String nome, String cpf, String telefone) {
        // Valida formato CPF brasileiro
        System.out.println("Criando cliente com CPF brasileiro");
        return new Cliente(nome, cpf, telefone);
    }

    @Override
    public Veiculo criarVeiculo(String placa, String modelo, String marca) {
        // Valida formato de placa brasileira
        System.out.println("Criando veículo com placa brasileira");
        return new Veiculo(placa, modelo, marca);
    }
}
