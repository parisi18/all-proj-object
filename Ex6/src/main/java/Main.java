// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  void teste() {
    // Logger = new Logger(); => daria um erro de compilação
  }

  void addBook() {
    Library library = Library.getInstance();
    library.addBook();
  }

  public static void main(String[] args) {
    Main m = new Main();
    LibraryInspect bi = new LibraryInspect();
    LibraryInspectProxy lip;
    lip = new LibraryInspectProxy(bi);

    m.addBook(); // adiciona um livro
    int c1 = lip.getBooksCount(); // recebe a quantidade de livros na base
    System.out.println("Quantidade de livros na primeira busca: " + c1);
    System.out.println("===============");
    int c2 = lip.getBooksCount(); // recebe a quantidade de livros no proxy
    System.out.println("Quantidade de livros na segunda busca: " + c2);
    System.out.println("===============");
    BookGenreFactory.create(); // cria um livro do gênero romance
  }
}