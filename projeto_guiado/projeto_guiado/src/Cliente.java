import java.util.ArrayList;
import java.util.List;

public class Cliente {
    //Uma classe Cliente com atributos básicos (nome, cpf)
    // e uma lista de contas.

    private String nome;
    private String CPF;

    //Composição: UM Cliente tem uma lista de contas(1 : N)
    private List<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public String getNome() {
        return nome;
    }
}
