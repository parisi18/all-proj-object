/**
* Engenharia de Software Moderna - Padrões de Projeto (Cap. 6)
* Rafael dos Santos Parisi
* 
* Exemplo do padrão de projeto Fábrica
*
*/

/**
 * Interface e classe dos objetos que serão fabricados.
 */

interface BookGenre {
}

class Romance implements BookGenre {
}

class Fantasy implements BookGenre {
}

/**
 * A classe ChannelFactory implementa um método fábrica estático.
 * Isto é, um método que centraliza a criação de objetos que
 * implementam a interface Channel
 *
 * Se amanhã quisermos que o sistema use UDPChannel, basta
 * mudar a implementação de create()
 */

class BookGenreFactory {

  public static BookGenre create() { // método fábrica estático
    System.out.println("Neste momento, estamos trabalhando com Romance");
    return new Romance();
  }
}
