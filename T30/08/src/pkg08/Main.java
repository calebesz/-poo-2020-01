package pkg08;

public class Main {

    public static void main(String[] args) {
        pessoa h = new pessoa("Fidelis Micaela");
        pessoa m = new pessoa("Derek Carlos");

        System.out.println(h);
        System.out.println(m);

        m.setNome(h.getNome());

        System.out.println(h);
        System.out.println(m);
    }
    
}
