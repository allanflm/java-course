package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {

		// criando uma variavel do tipo double(com ponto flutuante: ex: 3.4, 6.7);
		double raio = 3.4;
		
		// criando uma varivel constante;
		// constantes sao escritar todo em MAIUSCULAS;
		final double PI = 3.14159;
		
		// criando uma varivel com uma funcionalidade;
		double area = PI * raio * raio;
	
		System.out.println(area);
		
		// redefinindo o valor da variavel raio;
		raio = 10;
		area = PI * raio * raio;
		System.out.println("ÁREA: " + area + "m².");
	}
}
