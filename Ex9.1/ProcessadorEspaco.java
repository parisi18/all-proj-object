public class ProcessadorEspaco implements Processador {
    private Processador next;

    @Override
    public void setNext(Processador next) {
        this.next = next;
    }

    @Override
    public void processarRequisicao(String texto, TextMetrics metrics) {
        int spaces = 0;
        for (char c : texto.toCharArray()) {
            if (c == ' ')
                spaces++;
        }
        metrics.setEspacos(spaces);

        if (next != null) {
            next.processarRequisicao(texto, metrics);
        }
    }
}
