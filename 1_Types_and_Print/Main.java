public class Main {
    public static void main(String[] args) {
        String name = "Ark";
        // You can use + to combine variables in Java.
        System.out.print("(print) Hello " + name + '\n');
        System.out.println("(println) Hello " + name);
        System.out.printf("(printf) Hello %s\n", name);

        // final is like constant in C/C++
        final int myInt = 69; // This cannot be changed.
        // Remember to add an 'f' to indicate that the number is a floating point number
        float myFloat = 0.8f;
        // Characters surrounded by single bracket.
        char myChar = 'S';
        // Java boolean use lowercase letter as the first letter.
        boolean myBoolean = true;

        // You can actually use dollor sign($) in the identifier of Java.
        int yeahMy$ = 1000000000;
        System.out.println(yeahMy$);
    }
}