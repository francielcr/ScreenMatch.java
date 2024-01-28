public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean inclidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;

    void exibeFichaTecnica(){
        System.out.println("nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println(duracaoEmMinutos);
        System.out.println(totalDeAvaliacao);

    }

    void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;

    }
    double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacao;
    }

 }