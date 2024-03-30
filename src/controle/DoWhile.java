package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Voce precisa dizer as palavras magicas: ");
            System.out.println("Deseja sair? ");
            texto = input.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));
        System.out.println("Obrigado!");
        input.close();
    }
}
