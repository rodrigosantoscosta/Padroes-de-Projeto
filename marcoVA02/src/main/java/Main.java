import facade.SistemaAtendimentoFacade;

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
    }
}