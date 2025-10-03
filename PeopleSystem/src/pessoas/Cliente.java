package pessoas;

import auxs.Endereco;
import auxs.Telefone;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private Pessoa pessoaCliente;
    private Endereco enderecoCliente;
    private Telefone telsContato;

    public Cliente(Pessoa pessoaCliente, Endereco enderecoCliente, Telefone telsContato) {
        this.id = UUID.randomUUID();  // gera um id único automaticamente
        this.pessoaCliente = pessoaCliente;
        this.enderecoCliente = enderecoCliente;
        this.telsContato = telsContato;
    }

    public void cadastrar() {
        System.out.println("Cadastro do Cliente");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + pessoaCliente.getNome());
        System.out.println("Idade: " + pessoaCliente.obterIdade() + " anos");

        if (enderecoCliente != null) {
            enderecoCliente.exibirEndereco();
        } else {
            System.out.println("Endereço não informado.");
        }

        if (telsContato != null) {
            telsContato.exibirTelefone();
        } else {
            System.out.println("Telefone não informado.");
        }
    }

    // Getters e setters

    public UUID getId() {
        return id;
    }

    public Pessoa getPessoaCliente() {
        return pessoaCliente;
    }

    public void setPessoaCliente(Pessoa pessoaCliente) {
        this.pessoaCliente = pessoaCliente;
    }

    public Endereco getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(Endereco enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public Telefone getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(Telefone telsContato) {
        this.telsContato = telsContato;
    }
}
