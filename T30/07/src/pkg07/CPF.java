package pkg07;

public class CPF {
    private String numero;
    private int dataexp;

    public CPF(String numero, int dataexp) {
        this.numero = numero;
        this.dataexp = dataexp;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getDataexp() {
        return dataexp;
    }

    public void setDataexp(int dataexp) {
        this.dataexp = dataexp;
    }

    @Override
    public String toString() {
        return "CPF{" + "\n numero = " + numero + "\n data de expedição = " + dataexp + "}\n";
    }
    
    
}
