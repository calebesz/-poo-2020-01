package pkg02;

public class Main {

    public static void main(String[] args) {
        Livro l1 = new Livro("A rainha vermelha", "Victoria Aveyard", "Seguinte", 2015);
        Livro l2 = new Livro("Orwell 1984", "George Orwell", "Companhia das Letras", 2019);
        Livro l3 = new Livro("Uma terra prometida", "Barack Obama", "Companhia das Letras", 2020);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
    }
    
}
