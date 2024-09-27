import java.lang.*;

public class Array7
{
    public static void main(String[] args) 
    {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print Array length
        System.out.println("\nArray length: " + numbers.length + "\n");

        // Access and print each element of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("\tElement at index " + i + ": " + numbers[i]);
        }
    }
}
