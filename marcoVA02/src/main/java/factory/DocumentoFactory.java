package factory;
// ==================== PADRÃO ABSTRACT FACTORY ====================
// Fornece uma interface para criar famílias de objetos relacionados
// sem especificar suas classes concretas

import model.Cliente;
import model.Veiculo;

public interface DocumentoFactory {
    Cliente criarCliente(String nome, String documento, String contato);
    Veiculo criarVeiculo(String identificador, String modelo, String marca);
}