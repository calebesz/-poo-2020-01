
package pkg05;

public class Livro {
    private String titulo;
    private int ano;

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
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

    @Override
    public String toString() {
        return "Livro: " + "\n titulo = " + titulo + "\n ano = " + ano + "\n-----------------------\n";
    }
    
    
}
