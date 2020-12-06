package pkg07;

public class Pessoa {
    private Passaporte passaporte;
    private Identidade identidade;
    private Endereco endereco;
    private Cidade cidade;
    private CPF cpf;
    private String nome;
    private String corOlhos;
    private String corCabelo;
    private float peso;
    private float altura;
    private int AnoNasc;
    private String nomePai;
    private String nomeMae;

    public Pessoa(Passaporte passaporte, Identidade identidade, Endereco endereco, Cidade cidade, CPF cpf, String nome, String corOlhos, String corCabelo, float peso, float altura, int AnoNasc, String nomePai, String nomeMae) {
        this.passaporte = passaporte;
        this.identidade = identidade;
        this.endereco = endereco;
        this.cidade = cidade;
        this.cpf = cpf;
        this.nome = nome;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
        this.peso = peso;
        this.altura = altura;
        this.AnoNasc = AnoNasc;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

    public Passaporte getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(Passaporte passaporte) {
        this.passaporte = passaporte;
    }

    public Identidade getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Identidade identidade) {
        this.identidade = identidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getAnoNasc() {
        return AnoNasc;
    }

    public void setAnoNasc(int AnoNasc) {
        this.AnoNasc = AnoNasc;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "\n nome = " + nome + "\n Cor dos olhos = " + corOlhos + "\n Cor do cabelo = " + corCabelo + "\n Peso = " + peso + "\n Altura = " + altura + "\n Ano de nascimento = " + AnoNasc + "\n Nome do Pai=" + nomePai + "\n Nome da Mãe = " + nomeMae + "\n" +getCpf().toString() + "\n" + getCidade().toString() + "\n" + getEndereco().toString() + "\n" + getIdentidade().toString() + "\n" + getPassaporte().toString();
    }

  
    
}
