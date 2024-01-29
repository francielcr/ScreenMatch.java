package br.com.projeto.screenmatch.modelos;


public class Filme {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean inclidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;

    public void exibeFichaTecnica(){
        System.out.println("nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos " + duracaoEmMinutos);
        System.out.println("Total de avaliações" + totalDeAvaliacao);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setInclidoNoPlano(boolean inclidoNoPlano) {
        this.inclidoNoPlano = inclidoNoPlano;
    }

    public void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;

    }
    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacao;
    }

 }