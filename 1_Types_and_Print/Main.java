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

        // Below are some primitive data types in Java :thinking: Default
        // String is non-primitive type / reference type (refer to objects). It's a class.
        byte mybyte = 0b1111;
        byte myByte = 0B1111;   // You can use captial B for binary values too.
        byte myByte_x = 0xf;
        byte myByte_X = 0Xf;    // You can use captial X for hex values too.
        System.out.println("Big B: " + myByte + " Small b: " + mybyte + "x b: " + myByte_x + " X b: " + myByte_X);
        
        byte myMaxByte = 0b1111111;
        // You cannot do myMinByte = 0b10000000 somehow..., rejected by the compiler.
        byte myMinByte = 0b1; myMinByte <<= 7; 
        System.out.println("Max Long: " + myMaxByte + ", Min Long: " + myMinByte);

        short myMaxShort = 0b111111111111111;
        short myMinShort = 0b1000; myMinShort <<= 12;
        System.out.println("Max Short: " + myMaxShort + ", Min Short: " + myMinShort);

        int myMaxInt = (myMaxShort << 16) | (0b0001 << 15) | myMaxShort;
        int myMinInt = myMinShort << 16;
        System.out.println("Max Int: " + myMaxInt + ", Min Int: " + myMinInt);

        // To make myMinInt Positive, I first unsigned right shift once and then shift right again.
        // >>> means unsigned shift right.
        long myMaxLong = ((long)myMaxInt << 32) | ((long)(myMinInt >>> 1) << 1) | myMaxInt;
        long myMinLong = (long)myMinInt << 32;
        System.out.println("Max Long: " + myMaxLong + ", Min Long: " + myMinLong);

        // There is also double in Java
        double myDouble = 0.0001d;
        System.out.println("Double: " + myDouble);
        double myScientific = 69e20d;
        System.out.println("Scientific notation: " + myScientific);

        // Casting
        // This is called widening casting (cast to a bigger data type.)
        int i = (int)0b0001;
        // This is called narrowing casting. (the opposite of the above case)
        byte b = (byte)10; // Narrowing casting MUST be done manually.
    }
}