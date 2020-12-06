package pkg06;

import java.util.Date;

public final class Emprestimo {
   private Livro obra;
   private Pessoa funcionario;
   private Pessoa usuario;
   private Date data;

    public Emprestimo(Livro obra, Pessoa funcionario, Pessoa usuario, Date data) {
        this.obra = obra;
        this.funcionario = funcionario;
        this.usuario = usuario;
        this.data = data;
    }
   
   
   

   @Override
    public String toString() {
        return "Livro emprestado: " + obra.toString() + "\n"
               + "Funcionario: " + funcionario.getNome() + "\n"
               + "Usuario: " + usuario.getNome() + "\n"
               + "Data: " + getData().toString();
    }

    public Livro getObra() {
        return obra;
    }

    public void setObra(Livro obra) {
        this.obra = obra;
    }

    public Pessoa getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Pessoa funcionario) {
        this.funcionario = funcionario;
    }

    public Pessoa getUsuario() {
        return usuario;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
