package fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {

        System.out.println(2 + 3);

        var x = 34.34;
        double y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // Operador de modulo(%) -> resto da divisão
        System.out.println(a % b);
        System.out.println(8 % b);

        System.out.println(x + y - a * b);
    }
}
