public class TypeCastingExample {
    public static void main(String[] args) {
        // Declare a double variable with a decimal value
        double myDouble = 9.78;
        System.out.println("Original double: " + myDouble);

        // Cast double to int (narrowing conversion)
        int myInt = (int) myDouble;
        System.out.println("Double cast to int: " + myInt);

        // Declare an int variable
        int anotherInt = 15;
        System.out.println("Original int: " + anotherInt);

        // Cast int to double (widening conversion)
        double anotherDouble = (double) anotherInt; // Casting optional here
        System.out.println("Int cast to double: " + anotherDouble);
    }
}
