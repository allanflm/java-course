package fundamentos;

public class ConversaoTipoPrimitivo {
    public static void main(String[] args) {
        double a = 1;// implicita: int -> double
        System.out.println(a);

        float f = (float) 12.23; // 12.23F; -> explicita(CAST) -> (float)
        System.out.println(f);

        int c = 340;
        byte b = (byte) c; // explicita (CAST)
        System.out.println(b);

        double d = 1.999999;
        int i = (int) d;// explicita (CAST)
        System.out.println(i);
    }
}
