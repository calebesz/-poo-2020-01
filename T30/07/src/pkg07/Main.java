
package pkg07;

public class Main {

    public static void main(String[] args) {
        CPF cpf = new CPF("973674883", 2013);
        Cidade cidade = new Cidade("Goiania", "Goiás", 62);
        Endereco endereco = new Endereco("Oeste", "X-20", 126, 6348737);
        Identidade identidade = new Identidade("82172612", 2014, "Goias", "SSP");
        Passaporte passaporte = new Passaporte("38727236", 2015, 2025, "DPF");
        
        Pessoa pessoa;
        pessoa = new Pessoa(passaporte, identidade, endereco, cidade, cpf, "Nicolas", "Preto", "Preto", 67f, 1.75f, 1999, "Gerson", "Vanusa");
        
        System.out.println(pessoa);
    }
    
    
}
