public class Main {
    public static void main(String[] args) {
        String name = "Hilaris";
        // System.out.println(name.length);

        /*  There is no length attribute in String class
            Instead, it has length().
         */
        System.out.println(name.length());

        int[] arrayInt = {0, 1, 2, 3, 4};
        // System.out.println(arrayInt.length());

        /*  There is no length() method in array class
            Instead, it has length attribute.
         */
        System.out.println(arrayInt.length);

        // You can add space between type and [], and you can initiate an empty array using {}.
        int [][] multArray = {{}, {1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}};
        System.out.println(multArray.length);
        System.out.println(multArray[3].length);
    }
}