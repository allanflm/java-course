package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // ler n1
        // ler n2
        // + - / * %
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        double n1 = input.nextDouble();

        System.out.print("Informe outro numero: ");
        double n2 = input.nextDouble();

        System.out.print("Digite a operação: ");
        String op = input.next();

        double resultado = "+".equals(op) ? n1 + n2 : 0;
        resultado = "-".equals(op) ? n1 - n2 : resultado;
        resultado = "/".equals(op) ? n1 / n2 : resultado;
        resultado = "*".equals(op) ? n1 * n2 : resultado;
        resultado = "%".equals(op) ? n1 % n2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, resultado);

        input.close();

    }
}
