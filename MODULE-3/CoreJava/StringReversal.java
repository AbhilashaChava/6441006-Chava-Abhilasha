import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        String reversed1 = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string (using StringBuilder): " + reversed1);

        
        String reversed2 = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed2 += input.charAt(i);
        }
        System.out.println("Reversed string (using loop): " + reversed2);

        scanner.close();
    }
}
