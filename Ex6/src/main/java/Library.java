/**
* Engenharia de Software Moderna - Padrões de Projeto (Cap. 6)
* Rafael dos Santos Parisi
* 
* Exemplo do padrão de projeto Singleton
*
*/

/**
 * A classe é um Singleton.
 * Logo, por construção, poderá existir no máximo uma instância (objeto)
 * dessa classe.
 */
class Library {

  private Library() {
  } // proíbe clientes de chamar new Counter()

  private static Library instance; // instância única
  private int book_count = 0;

  public static Library getInstance() {
    if (instance == null) // 1a vez que chama-se getInstance
      instance = new Library();
    return instance;
  }

  public void addBook() {
    // registra o evento de contagem
    book_count++;
  }

  public int getBookCount() {
    return book_count;
  }
}
