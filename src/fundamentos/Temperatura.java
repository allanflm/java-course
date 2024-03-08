package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C

		double fahrenheit = 86;

		final double AJUSTE = 32;
		final double FATOR = 5 / 9.0;
	
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("RESULTADO: " + celsius + "°C.");
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("RESULTADO: " + celsius + "°C.");
	}
}
