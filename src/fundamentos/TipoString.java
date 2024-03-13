package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        // Retorna o caracter que esta no index
        System.out.println("Ola pessoal".charAt(2));

        String s = "Boa tarde";

        // Juntando strings -> Concatenando
        // junta s + !!!
        System.out.println(s.concat("!!!"));
        // Mesma coisa
        System.out.println(s + "!!!");

        // começa com ...
        System.out.println(s.startsWith("boa")); // funcao que restorna verdadeiro ou falso.
        // juntando dois metodos da String.
        System.out.println(s.toLowerCase().startsWith("boa"));

        // termina com ...
        System.out.println(s.endsWith("de"));// funcao que retorna verdadeiro ou falso.

        // retorna a quantidade de caracteres de ums string.
        System.out.println(s.length());// string -> int

        // compara strings
        System.out.println(s.equals("boa tarde"));
        // compara strings ignorando letra Maiusculas ou Minusculas
        System.out.println(s.equalsIgnoreCase("Boa tarDE"));

        System.out.println("\n\n");

        var nome = "Allan";
        var sobrenome = "Felipe";
        var idade = 20;
        var salario = 12345.998;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: R$"
                + salario + "\n\n";
        System.out.println(maisUmaFrase);
        /**
         * %s -> string
         * %d -> int
         * %f -> double
         */
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);

        System.out.println("\n\n");

        String fraseFormatada = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade,
                salario);
        System.out.println(fraseFormatada);

        // funcionalidades da String:

        // contem na frase...
        System.out.println("Frase qualquer".contains("qual"));

        // retorna o indice da primeria letra
        System.out.println("Frase qualquer".indexOf("qual"));

        // apartir do indice...
        System.out.println("Frase qualquer".substring(6));

        // apartir do indice e termina no indice -1
        System.out.println("Frase qualquer".substring(6, 10));
    }
}
