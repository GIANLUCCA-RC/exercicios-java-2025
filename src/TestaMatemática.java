public class TestaMatemática {
    public static void main(String[] args) {
        Matemática mat = new Matemática();
        System.out.println("Soma = " + mat.somar(40, 2));
        System.out.println("Idade = " + mat.subtrair(2025, 1975));
        System.out.println(new Matemática().somar(665, 1));
    }
}
