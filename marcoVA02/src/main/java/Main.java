import facade.SistemaAtendimentoFacade;
import adapter.AtendimentoAdapter;
import adapter.SistemaLegadoAtendimento;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Usando o FACADE - interface simplificada para o sistema
        SistemaAtendimentoFacade sistema = new SistemaAtendimentoFacade();

        // Criando atendimentos de diferentes tipos
        sistema.criarAtendimentoCompleto(
                "João Silva", "123.456.789-00", "(83) 98765-4321",
                "ABC-1234", "Civic", "Honda",
                "MANUTENÇÃO"
        );

        sistema.criarAtendimentoCompleto(
                "Maria Santos", "987.654.321-00", "(83) 91234-5678",
                "XYZ-9876", "Corolla", "Toyota",
                "REVISÃO"
        );

        // Alterando para documentos internacionais
        System.out.println("\n>>> Configurando para documentos internacionais <<<\n");
        sistema.setTipoDocumento(true);

        sistema.criarAtendimentoCompleto(
                "John Doe", "US123456", "+1-555-0123",
                "INT-5678", "Model 3", "Tesla",
                "VISTORIA"
        );

        // Testando o Adapter com leitura de JSON
        System.out.println("\n>>> Testando leitura de atendimento a partir de JSON <<<\n");
        
        try {
            String filePath = System.getProperty("user.dir") + "/atendimento.json";
            sistema.registrarAtendimentoDeJson(filePath);
        } catch (Exception e) {
            System.err.println("Erro ao processar o arquivo JSON: " + e.getMessage());
        }
    }
}