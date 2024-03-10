package fundamentos;

public class TipoPrimitivos {
	public static void main(String[] args) {
		// Informações de um funcionario:

		// Tipo numericos inteiros:
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 5678;
		long pontosAcumulados = 3_456_789_223L;

		// Tipos numericos reais:
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo booleano:
		boolean estaDeFerias = false;

		// Tipo caracter;
		char status = 'A'; // ativo

		// Dias de empresa:
		System.out.println(anosDeEmpresa * 365);

		// Numero de viagens:
		System.out.println(numeroDeVoos / 2);

		// Pontos por real:
		System.out.println(pontosAcumulados / vendasAcumuladas);

		// id do funcionario:
		System.out.println(id + ": ganhas -> " + salario);

		// esta de ferias:
		System.out.println("Esta de ferias: " + estaDeFerias);

		// Status do funcionario:
		System.out.println("Status: " + status);
	}
}
