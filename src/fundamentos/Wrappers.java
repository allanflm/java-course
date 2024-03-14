package fundamentos;

public class Wrappers {
    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;
        // = Interger.parseInt("1000"); -> é convertido para int
        Integer i = 10000; // int
        Long l = 100000L;
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 2);

        Float f = 123.10F;
        Double d = 1234.5678;
        System.out.println(f);
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("True");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");
    }
}
