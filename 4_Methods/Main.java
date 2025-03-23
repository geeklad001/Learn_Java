public class Main {
    public static void main(String[] args) {
        myMethod();
    }

    // You don't need forward declaration in Java.
    private static void myMethod() {
        System.out.println("Hello Methods.");
    }
}