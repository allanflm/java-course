package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = true;

        boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
        boolean comprouTV30 = trabalhoTerca ^ trabalhoQuinta;

        boolean tomouSorvete = comprouTV30 || comprouTV50;

        boolean ficouEmCasa = !tomouSorvete; // Operador Unario

        System.out.println("Comprou TV 50: " + comprouTV50);
        System.out.println("Comprou TV 30: " + comprouTV30);
        System.out.println("Foi no shopping tomar sorvete: " + tomouSorvete);

        System.out.println("Nao foi no shopping: " + ficouEmCasa);

    }
}
