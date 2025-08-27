public class TestaPessoa {
    public static void main(String[] args) {
        // Cria um objeto da classe Pessoa
        Pessoa Gian = new Pessoa();
        Gian.nome = "Gianlucca Ravese Canello";
        Gian.idade = 21;
        System.out.println(Gian.nome);
        System.out.println(Gian.idade);
        // Cria mais uma instância de Pessoa
        Pessoa Larissa = new Pessoa();
        Larissa.nome = "Larissa Bueno da Silva";
        Larissa.idade = 20;
        System.out.println(Larissa.nome);
        System.out.println(Larissa.idade);
    }
}
