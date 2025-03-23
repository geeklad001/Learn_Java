// This will result as a infinite recursion.
// It's just a program to show that you can actually
// call the main() inside the Main object.
public class Main {
    int num = 10;
    public static void main(String[] args) {
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        System.out.println(myObj1.num);
        System.out.println(myObj2.num);
        String[] args1 = {"Hello", "Class"};
        // Please don't do things like the line below.
        // myObj1.main(args1);
        
        // You can use the class inside the same directory without importing it.
        MyClass myClassObj = new MyClass();
        myClassObj.myClassInt = 12;
        System.out.println(myClassObj.getInt());
    }
}