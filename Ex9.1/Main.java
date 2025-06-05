public class Main {

        Processador ponto = new ProcessadorPonto();
        Processador letraA = new ProcessadorLetraA();

        espaco.setNext(ponto);
        ponto.setNext(letraA);
        letraA.setNext(null);

        String texto = "Quantos espaços tem aqui? E quantos pontos. Tem dois. E quantos A?";

        TextMetrics metrics = new TextMetrics();
        espaco.processarRequisicao(texto, metrics);

        System.out.println("Número de espaços: " + metrics.getEspacos());
        System.out.println("Número de pontos: " + metrics.getPontos());
        System.out.println("Número de letras A: " + metrics.getLetraA());
    }
}
