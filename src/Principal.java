public class Principal {
   public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.nome = "O poderoso Chefão";
    meuFilme.anoDeLancamento = 1970;
    meuFilme.duracaoEmMinutos = 180;

    meuFilme.avalia(8.0);
    meuFilme.avalia(5.0);
    meuFilme.avalia(10.0);

    meuFilme.exibeFichaTecnica();
    System.out.println(meuFilme.pegaMedia());
   }
}
