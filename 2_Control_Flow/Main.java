// This will print all the numbers below and include the number itself (0 < n <= 5)
public class Main {
    public static void main(String[] args) {
        int n = 3;
        switch(n) {
            case 5:
                System.out.print(5);
            case 4:
                System.out.print(4);
            case 3:
                System.out.print(3);
            case 2:
                System.out.print(2);
            case 1:
                System.out.print(1);
            default:
                System.out.print("Default.");
        }
        System.out.println("");
    }
}