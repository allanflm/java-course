package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a sua média: ");
        double media = input.nextDouble();
        if (media <= 10 && media >= 7.0) {

            System.out.println("Aprovado!");
            System.out.println("Parabens!");

        }
        if (media < 7 && media >= 5) {
            System.out.println("Recuperação!");
        }
        boolean criterioReprovacao = media < 5 && media >= 0;
        if (criterioReprovacao) {
            System.out.println("Reprovado");
        }

        input.close();
    }
}
