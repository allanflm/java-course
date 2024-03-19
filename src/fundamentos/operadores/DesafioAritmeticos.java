package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        double numA = (6 * (3 + 2));
        double denA = 3 * 2;
        double superiorA = Math.pow(numA, 2);
        double resuA = superiorA / denA;

        double supB = ((1 - 5) * (2 - 7));
        double resuB = Math.pow(supB / 2, 2);

        double opSup = resuA - resuB;

        double resultado = Math.pow(opSup / 10, 3);

        System.out.println("O resultado é: " + resultado);

    }
}
