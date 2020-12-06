package pkg06;

public class Pessoa {
    private String nome;
    private int AnoNasc;

    public Pessoa(String nome, int AnoNasc) {
        this.nome = nome;
        this.AnoNasc = AnoNasc;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return AnoNasc;
    }

    public void setAnoNasc(int AnoNasc) {
        this.AnoNasc = AnoNasc;
    }

    @Override
    public String toString() {
        return getNome() + " (nascimento: " + getAnoNasc() + ")";
    }
    
    
}
