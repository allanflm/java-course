package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digit o dia da semana: ");
        String dia = input.nextLine();

        if (dia.equalsIgnoreCase("Segunda") || dia.equalsIgnoreCase("Segunda-Feira")) {
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca") || dia.equalsIgnoreCase("terca-Feira")
                || dia.equalsIgnoreCase("terça-Feira")) {
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("Quarta") || dia.equalsIgnoreCase("Quarta-Feira")) {
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("Quinta") || dia.equalsIgnoreCase("Quinta-Feira")) {
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("Sexta") || dia.equalsIgnoreCase("Sexta-Feira")) {
            System.out.println(6);
        } else if (dia.equalsIgnoreCase("Sabado")) {
            System.out.println(7);
        } else if (dia.equalsIgnoreCase("Domingo")) {
            System.out.println(1);
        } else {
            System.out.println("Dia invalido!");
        }

        input.close();
    }
}
