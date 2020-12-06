
package pkg01;

public abstract class ItemNotaFiscal extends Produto {
    private int quantidade;
    public float Total;
    public float PrecoComImposto;

    public ItemNotaFiscal(String descricao, float preco, float aliquota, int quantidade) {
        super(descricao, preco, aliquota);
        this.quantidade = quantidade;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal() {
        this.Total = this.quantidade * this.PrecoComImposto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoComImposto() {
        return PrecoComImposto;
    }

    public void setPrecoComImposto() {
        this.PrecoComImposto = this.preco * (this.aliquota + 1) ;
    }

    @Override
    public String toString() {
        return "ItemNotaFiscal{" + "Total=" + Total + '}';
    }
    
    
    
}
