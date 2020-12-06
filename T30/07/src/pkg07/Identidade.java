package pkg07;

public class Identidade {
    private String numero;
    private int AnoExp;
    private String local;
    private String orgaoeexpedidor;

    public Identidade(String numero, int AnoExp, String local, String orgaoeexpedidor) {
        this.numero = numero;
        this.AnoExp = AnoExp;
        this.local = local;
        this.orgaoeexpedidor = orgaoeexpedidor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getAnoExp() {
        return AnoExp;
    }

    public void setAnoExp(int AnoExp) {
        this.AnoExp = AnoExp;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getOrgaoeexpedidor() {
        return orgaoeexpedidor;
    }

    public void setOrgaoeexpedidor(String orgaoeexpedidor) {
        this.orgaoeexpedidor = orgaoeexpedidor;
    }

    @Override
    public String toString() {
        return "Identidade{" + "\n numero = " + numero + "\n Ano Expedição = " + AnoExp + "\n Local = " + local + "\n Órgao expedidor = " + orgaoeexpedidor + "}\n";
    }
    
    
}
