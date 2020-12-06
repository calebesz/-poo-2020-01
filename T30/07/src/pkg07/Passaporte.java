package pkg07;

public class Passaporte {
    private String numero;
    private int anoExp;
    private int anoVal;
    private String Orgaoexp;

    public Passaporte(String numero, int anoExp, int anoVal, String Orgaoexp) {
        this.numero = numero;
        this.anoExp = anoExp;
        this.anoVal = anoVal;
        this.Orgaoexp = Orgaoexp;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getAnoExp() {
        return anoExp;
    }

    public void setAnoExp(int anoExp) {
        this.anoExp = anoExp;
    }

    public int getAnoVal() {
        return anoVal;
    }

    public void setAnoVal(int anoVal) {
        this.anoVal = anoVal;
    }

    public String getOrgaoexp() {
        return Orgaoexp;
    }

    public void setOrgaoexp(String Orgaoexp) {
        this.Orgaoexp = Orgaoexp;
    }

    @Override
    public String toString() {
        return "Passaporte{" + "\n numero = " + numero + "\n ano expedição = " + anoExp + "\n validade=" + anoVal + "\n Órgao expedidor = " + Orgaoexp + "}\n";
    }
    
    
    
}
