/**
* Engenharia de Software Moderna - Padrões de Projeto (Cap. 6)
* Rafael dos Santos Parisi
* 
* Exemplo do padrão de projeto Proxy
*
*/
/**
 * Interface implementada pelo objeto base e pelo Proxy
 */
interface LibraryBooksCountInterface {
  int getBooksCount();
}

/**
 * Classe do objeto base
 */
class LibraryInspect implements LibraryBooksCountInterface {

  public int getBooksCount() {
    System.out.println("Pesquisando a quantidade de livros... ");
    Library library = Library.getInstance();
    return library.getBookCount();
  }
}

/**
 * Classe Proxy
 */
class LibraryInspectProxy implements LibraryBooksCountInterface {

  private LibraryBooksCountInterface base;

  private int books_count;

  LibraryInspectProxy(LibraryBooksCountInterface base) {
    this.base = base;
  }

  public int getBooksCount() {
    System.out.println("Entrando no proxy...");

    // A ideia aqui é que o Proxy conhece a quantiade de livros que tem na
    // biblioteca
    // Logo, ele nem precisa fazer a consulta ao objeto base
    if (books_count == 1) {
      System.out.println("Quantidade de livros achado no proxy...");
    } else {
      System.out.println("Quantidade de livros não achado no proxy; repassando chamada para objeto base...");
      books_count = base.getBooksCount();
    }
    System.out.println("Saindo do Proxy");
    return books_count;
  }

}
