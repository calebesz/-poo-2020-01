package pkg06;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
       Editora editora = new Editora("Marvel", "135 W. 50th Street");
        Pessoa autor = new Pessoa("Christopher L. Bennett", 1970);
        Livro l = new Livro("Homem Aranha: Entre Trovões",2007,editora,autor);

        // Cria instância que representa o empréstimo do livro
        Pessoa func = new Pessoa("Ednaldo Pereira", 1960);
        Pessoa usr = new Pessoa("Davy Jones",1980);
        Emprestimo emp = new Emprestimo(l,func,usr, new Date());

        // Imprime conteúdo de empréstimo representado
        // pela instância criada acima.
        System.out.println(emp);
    }
    
}
