package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota = 0;
        int quantidadeDeNota = 0;
        double total = 0;
        while (nota != -1) {
            System.out.print("Digite uma nota: ");
            nota = input.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNota++;
            } else if (nota != -1) {
                System.out.println("Nota invalida!");
            }
        }
        double media = total / quantidadeDeNota;
        System.out.println("Media: " + media);

        input.close();
    }
}
