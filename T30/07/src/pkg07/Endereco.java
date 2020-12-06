package pkg07;

public class Endereco {
    private String setor;
    private String rua;
    private int numero;
    private int cep;

    public Endereco(String setor, String rua, int numero, int cep) {
        this.setor = setor;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "\n Setor = " + setor + "\n Rua = " + rua + "\n Numero = " + numero + "\n CEP = " + cep + "\n}";
    }
    
    
}
