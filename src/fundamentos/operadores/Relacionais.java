package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(30 != 7);
        System.out.println(3 > 4);
        System.out.println(3 >= 4);
        System.out.println(3 < 7);
        System.out.println(3 <= 7);

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouDeAno = nota >= 7;
        boolean temDesonto = bomComportamento && passouDeAno;

        System.out.println("Tem desconto? " + temDesonto);
    }
}
