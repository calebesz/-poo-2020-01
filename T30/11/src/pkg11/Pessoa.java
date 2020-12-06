package pkg11;

import java.util.HashSet;
import java.util.Set;

public class Pessoa {
    private String nome;
    private Set telefones = new HashSet();

    public Pessoa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaTelefone(Telefone t) {
        telefones.add(t);
    }

    public void removeTelefone(Telefone t) {
        telefones.remove(t);
    }

    @Override
    public String toString() {
        return getNome() + " telefones: " + telefones.toString();}
}
