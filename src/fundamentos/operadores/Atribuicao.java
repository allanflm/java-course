package fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = b + a;

        c += a; // c = c + a;
        c -= a;
        c *= a;
        c /= a;
        System.out.println(c);
        c %= 2; // 0 ou 1
        System.out.println(c);

        c++; // c = c + 1

    }
}
