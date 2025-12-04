package adapter;

import model.Atendimento;

// Adapter que adapta o sistema legado para a interface moderna
public class AtendimentoAdapter {
    private SistemaLegadoAtendimento sistemaLegado;

    public AtendimentoAdapter(SistemaLegadoAtendimento sistemaLegado) {
        this.sistemaLegado = sistemaLegado;
    }

    // Método adaptado que converte objetos modernos para o formato legado
    public void registrarAtendimento(Atendimento atendimento) {
        System.out.println("\n[ADAPTER] Convertendo formato moderno para sistema legado...");
        sistemaLegado.registrar(
            atendimento.getCliente().getNome(),
            atendimento.getCliente().getCpf(),
            atendimento.getVeiculo().getPlaca(),
            atendimento.getTipoServico()
        );
    }
}
