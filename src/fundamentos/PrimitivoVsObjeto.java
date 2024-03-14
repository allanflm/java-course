package fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        String s = new String("Texto");
        s.toUpperCase();

        System.out.println(s);

        // Wrappers são a versao objeto dos tipos primitivos.
        int a = 123;
        // a. -> nao exites funcionalidades
        System.out.println(a);
    }
}
