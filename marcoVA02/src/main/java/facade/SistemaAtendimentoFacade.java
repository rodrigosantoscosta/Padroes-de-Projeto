package facade;

import adapter.AtendimentoAdapter;
import adapter.SistemaLegadoAtendimento;
import factory.*;
import model.Atendimento;
import model.Cliente;
import model.Veiculo;

// Facade que fornece uma interface simplificada para o sistema de atendimento
public class SistemaAtendimentoFacade {
    private DocumentoFactory documentoFactory;
    private AtendimentoFactory atendimentoFactory;
    private AtendimentoAdapter adapter;
    private int proximoId = 1;

    public SistemaAtendimentoFacade() {
        // Configuração padrão
        this.documentoFactory = new DocumentoBrasilFactory();
        this.atendimentoFactory = new ManutencaoFactory();
        this.adapter = new AtendimentoAdapter(new SistemaLegadoAtendimento());
    }

    // Método simplificado que encapsula toda a complexidade
    public Atendimento criarAtendimentoCompleto(
            String nomeCliente, String cpf, String telefone,
            String placa, String modelo, String marca,
            String tipoServico) {
        
        System.out.println("\n========== FACADE: Iniciando criação de atendimento ==========");
        
        // 1. Cria cliente e veículo usando Abstract Factory
        Cliente cliente = documentoFactory.criarCliente(nomeCliente, cpf, telefone);
        Veiculo veiculo = documentoFactory.criarVeiculo(placa, modelo, marca);
        
        // 2. Define qual Factory Method usar baseado no tipo
        switch (tipoServico.toUpperCase()) {
            case "MANUTENÇÃO":
                atendimentoFactory = new ManutencaoFactory();
                break;
            case "REVISÃO":
                atendimentoFactory = new RevisaoFactory();
                break;
            case "VISTORIA":
                atendimentoFactory = new VistoriaFactory();
                break;
        }
        
        // 3. Cria atendimento usando Factory Method
        Atendimento atendimento = atendimentoFactory.registrarAtendimento(proximoId++, cliente, veiculo);
        
        // 4. Registra no sistema legado usando Adapter
        adapter.registrarAtendimento(atendimento);
        
        System.out.println("\n✓ Atendimento criado com sucesso!");
        System.out.println(atendimento);
        System.out.println("===============================================================\n");
        
        return atendimento;
    }

    // Método para alterar o tipo de documento (nacional/internacional)
    public void setTipoDocumento(boolean internacional) {
        if (internacional) {
            this.documentoFactory = new DocumentoInternacionalFactory();
        } else {
            this.documentoFactory = new DocumentoBrasilFactory();
        }
    }

    /**
     * Registra um atendimento a partir de um arquivo JSON
     * @param filePath Caminho do arquivo JSON contendo os dados do atendimento
     * @throws Exception Se ocorrer um erro ao processar o arquivo JSON
     */
    public void registrarAtendimentoDeJson(String filePath) throws Exception {
        System.out.println("\n[FACADE] Processando atendimento a partir de JSON...");
        adapter.registrarAtendimentoDeJson(filePath);
    }
}
