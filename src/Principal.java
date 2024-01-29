import br.com.projeto.screenmatch.modelos.Filme;

public class Principal {
   public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.setNome("O poderoso chefão");
    meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);
    meuFilme.setInclidoNoPlano(true);


    meuFilme.avalia(8.0);
    meuFilme.avalia(5.0);
    meuFilme.avalia(10.0);

    meuFilme.exibeFichaTecnica();
    System.out.println(meuFilme.pegaMedia());
   }
}
