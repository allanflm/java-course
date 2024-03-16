package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String v1 = JOptionPane.showInputDialog("Digite um numero: ");
        String v2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

        double n1 = Double.parseDouble(v1);
        double n2 = Double.parseDouble(v2);

        double soma = n1 + n2;

        System.out.println("A soma é: " + soma);
        System.out.println("Média: " + soma / 2);
    }
}
