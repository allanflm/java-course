package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        // Os tipo primitivos nao possuem a notacao "."
        int a = 3;
        // a.
        System.out.println(a);

        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        String y = "Allan".toUpperCase();
        System.out.println(y);

        String x = "Bom dia X"
                .replace("X", "Allan")
                .toUpperCase()
                .concat("!!!");
        System.out.println(x);

    }
}
