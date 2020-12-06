package pkg07;

public class Cidade {
    private String nome;
    private String estado;
    private int ddd;

    public Cidade(String nome, String estado, int ddd) {
        this.nome = nome;
        this.estado = estado;
        this.ddd = ddd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    @Override
    public String toString() {
        return "Cidade{" + "\n nome = " + nome + "\n estado = " + estado + "\n ddd = " + ddd + "}\n";
    }
    
    
}
