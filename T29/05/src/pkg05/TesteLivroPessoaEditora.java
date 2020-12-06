
package pkg05;

public class TesteLivroPessoaEditora {

    public static void main(String[] args) {
            Pessoa p = new Pessoa("René Descartes", 1596);
            Editora e = new Editora("Martin Claret", "Rua Alegrete, 62, Bairro Sumaré");
            Livro l = new Livro("Discurso do Método", 2002);
            
            System.out.println(p.toString());
            System.out.println(e.toString());
            System.out.println(l.toString());
    }
    
}
