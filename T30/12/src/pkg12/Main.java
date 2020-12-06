package pkg12;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
    Motorista m1 = new Motorista("Ze", "1");
        Carro c1 = new Carro("ZAZ 9999");

      
        Locacao l1 = new Locacao();
        Calendar c = Calendar.getInstance();
        c.set(2004,4,1);
        l1.setDataInicial(c.getTime());
        c.set(2004,4,5); 
        l1.setDataFinal(c.getTime());
        l1.setKmInicial(150);
        l1.setKmFinal(490);
        l1.setPrecoDia(32);
        l1.setPrecoKm(1.2F);
        l1.setCarro(c1);
        l1.setMotorista(m1);

        
        System.out.println(l1);
    }
    
}
