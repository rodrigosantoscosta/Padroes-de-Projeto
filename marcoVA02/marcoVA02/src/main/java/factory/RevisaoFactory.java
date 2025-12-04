package factory;

import model.Atendimento;
import model.Cliente;
import model.Veiculo;

// Fábrica concreta para atendimentos de revisão
public class RevisaoFactory extends AtendimentoFactory {
    @Override
    public Atendimento criarAtendimento(int id, Cliente cliente, Veiculo veiculo) {
        return new Atendimento(id, cliente, veiculo, "REVISÃO");
    }
}
