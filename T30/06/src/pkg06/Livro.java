package pkg06;

public class Livro {
     private String titulo;
    private int ano;
    private Editora editora;
    private Pessoa autor;
    
    

    public Livro(String titulo, int ano, Editora editora, Pessoa autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }
    
     @Override
    public String toString() {
        return getTitulo() + "\n" + getAutor().toString() + "\n"
               + getEditora().getNome() + ", " + getAno() + "\n"
               + getEditora().getLocal();
    }
}
