package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 9.6;
        String resultadoFinal = media >= 7 ? "aprovado" : "em recuperação";

        System.out.println("O aluno esta " + resultadoFinal);

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouDeAno = nota >= 7;
        boolean temDesonto = bomComportamento && passouDeAno;

        String resultado = temDesonto ? "Sim." : "Não.";

        System.out.println("Tem desconto? " + resultado);
    }
}
