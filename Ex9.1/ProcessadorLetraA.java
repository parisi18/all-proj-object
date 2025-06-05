public class ProcessadorLetraA implements Processador {
    private Processador next;

    @Override
    public void setNext(Processador next) {
        this.next = next;
    }

    @Override
    public void processarRequisicao(String texto, TextMetrics metrics) {
        int aCount = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == 'a')
                aCount++;
        }

        if (next != null) {
            next.processarRequisicao(texto, metrics);
        }
    }
}
