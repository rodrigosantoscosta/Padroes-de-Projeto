package adapter;

// Sistema legado com interface diferente
public class SistemaLegadoAtendimento {
    public void registrar(String nomeCliente, String cpfCliente, String placaVeiculo, String tipo) {
        System.out.println("Sistema Legado: Registrando atendimento");
        System.out.println("  Cliente: " + nomeCliente + " - CPF: " + cpfCliente);
        System.out.println("  Veículo: " + placaVeiculo);
        System.out.println("  Tipo: " + tipo);
    }
}
