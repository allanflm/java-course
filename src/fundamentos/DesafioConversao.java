package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro salario: ");
        String salarioStr1 = input.next().replace(",", ".");
        System.out.print("Informe o segundo salario: ");
        String salarioStr2 = input.next().replace(",", ".");
        System.out.print("Informe o tercerio salario: ");
        String salarioStr3 = input.next().replace(",", ".");

        Double salarioNumber1 = Double.parseDouble(salarioStr1);
        Double salarioNumber2 = Double.parseDouble(salarioStr2);
        Double salarioNumber3 = Double.parseDouble(salarioStr3);

        double media = (salarioNumber1 + salarioNumber2 + salarioNumber3) / 3;

        System.out.printf("Média dos salarios: R$ %.2f.", media);

        input.close();
    }
}
