package factory;

import model.Atendimento;
import model.Cliente;
import model.Veiculo;

public abstract class AtendimentoFactory {
    // Factory Method: método abstrato que será implementado pelas subclasses
    public abstract Atendimento criarAtendimento(int id, Cliente cliente, Veiculo veiculo);

    // Método template que usa o Factory Method
    public Atendimento registrarAtendimento(int id, Cliente cliente, Veiculo veiculo) {
        Atendimento atendimento = criarAtendimento(id, cliente, veiculo);
        System.out.println("Atendimento registrado: " + atendimento.getTipoServico());
        return atendimento;
    }
}
