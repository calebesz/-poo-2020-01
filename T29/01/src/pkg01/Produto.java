package pkg01;

public abstract class Produto {
    private String descricao;
    public float preco;
    public float aliquota;

    public Produto(String descricao, float preco, float aliquota) {
        this.descricao = descricao;
        this.preco = preco;
        this.aliquota = aliquota;
    }

    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


    
}
