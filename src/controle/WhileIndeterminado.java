package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String valor = "";
        while (!valor.equalsIgnoreCase("saiu")) {
            System.out.print("Digite algo: ");
            valor = input.nextLine();
        }

        input.close();
    }
}
