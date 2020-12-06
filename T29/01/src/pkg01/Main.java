
package pkg01;
public class Main {

    public static void main(String[] args) {
      NotaFiscal n[] = new NotaFiscal[1]; 
      n[0] = new NotaFiscal("Compras", 33.5f, 0.2f, 1);
        n[0].setPrecoComImposto();
        n[0].setTotal();
        System.out.println(n[0].toString());
    }
    
}
