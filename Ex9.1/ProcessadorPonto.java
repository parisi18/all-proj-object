public class ProcessadorPonto implements Processador {
    private Processador next;

    @Override
    public void setNext(Processador next) {
        this.next = next;
    }

    @Override
    public void processarRequisicao(String texto, TextMetrics metrics) {
        int pontos = 0;
        for (char c : texto.toCharArray()) {
            if (c == '.')
                pontos++;
        }
        metrics.setPontos(pontos);

        if (next != null) {
            next.processarRequisicao(texto, metrics);
        }
    }
}
