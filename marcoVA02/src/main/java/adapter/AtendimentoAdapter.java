package adapter;

import model.Atendimento;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

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
    
    /**
     * Lê um atendimento de um arquivo JSON e o registra no sistema legado
     * @param filePath Caminho do arquivo JSON contendo os dados do atendimento
     * @throws IOException Se ocorrer um erro ao ler o arquivo
     */
    public void registrarAtendimentoDeJson(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Atendimento atendimento = mapper.readValue(new File(filePath), Atendimento.class);
        
        System.out.println("\n[ADAPTER] Lendo atendimento do arquivo JSON: " + filePath);
        registrarAtendimento(atendimento);
    }
}
