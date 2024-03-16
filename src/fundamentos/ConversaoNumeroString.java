package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer n1 = 1000;
        System.out.println(n1.toString().length());

        int n2 = 10000;
        System.out.println(Integer.toString(n2).length());
    }

}
