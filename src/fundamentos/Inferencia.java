package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		/**
		 * numero == numero
		 * String == String
		 */
		
		double a = 4.5; // declarando e inicalizando
		System.out.println(a);
		a = 12;
		System.out.println(a);
//		a = "...";
		
		var b = "texto";
		System.out.println(b);
		b = "Outro texto";
		System.out.println(b);
		
//		b = 12; // nao pode mudar o tipo da variavel
		
		double c; // declarando
		c = 123.13; // inicializando 
		System.out.println(c); // usando!
		
		// Não pode converter de int -> double
		int d = 12;
//		d = 12.01;
		System.out.println(d);
		
		/*
		 * Se a variavel for criada com VAR
		 * Obrigatoriamente ele tem que ser
		 * Declarada e Inicializada
		 *
		 */
		
//		var e;
		var e = "Declarada e Inicializada";
		System.out.println(e);
		
		
	}
}
