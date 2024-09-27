import java.lang.*;

public class Js
{

    public static void main(String[] args)
    {
        String str = "Hello, World!";

        // Print length of string
        System.out.println("\n Length: " + str.length());

        // Convert to uppercase and lowercase
        System.out.println("\n Uppercase: " + str.toUpperCase());
        System.out.println("\n Lowercase: " + str.toLowerCase());

        // Replace
        String newStr = str.replace("World", "Java");
        System.out.println("\n Replaced: " + newStr);

        // Check if contains
        System.out.println("\n Contains 'World': " + str.contains("World"));

        // Split 
        String[] parts = str.split(",");
        for (String part : parts) 
        {
            System.out.println("\n Part: " + part);
        }
    }
}