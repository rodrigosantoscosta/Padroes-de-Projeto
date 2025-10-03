package pessoas;

import auxs.Endereco;
import auxs.Telefone;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pessoa {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(List<Telefone> telsContato) {
        this.telsContato = telsContato;
    }

    private String nome;
    private Date dataNascimento;
    private Endereco endereco;
    private List<Telefone> telsContato;

    public Pessoa(String nome, Date dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = new ArrayList<>();
    }

    public void cadastrar(){

    }

    public int obterIdade() {
        if (dataNascimento == null) {
            return 0;
        }

        Calendar hoje = Calendar.getInstance();
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(dataNascimento);

        int idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);

        // Ajustar se ainda não fez aniversário no ano atual
        int mesHoje = hoje.get(Calendar.MONTH);
        int diaHoje = hoje.get(Calendar.DAY_OF_MONTH);
        int mesNascimento = nascimento.get(Calendar.MONTH);
        int diaNascimento = nascimento.get(Calendar.DAY_OF_MONTH);

        if (mesHoje < mesNascimento || (mesHoje == mesNascimento && diaHoje < diaNascimento)) {
            idade--;
        }
        return idade;
    }
}
