import java.lang.*;
import java.util.*;

public static void main(String[] args)
{
    int i = 0;
    int[] Num = new int[5];
    Scanner sc = new Scanner(System.in);

    for(i = 0; i < 5; i++)
    {
        System.out.println("\n Value of Element " + (i+1) + " = " + Num[i] + ".");
    }

    for(i = 0; i < 5; i++)
    {
        System.out.println("\n Value of Element " + (i+101) + " : ");
        Num[1] = sc.nextInt();
    }

    System.out.println("\n Entered Values in Array are => \n");

    for(i = 0; i < 5; i++)
    {
        System.out.println("\n Value of Element " + (i+1) + " = " + Num[i] + ".");
    }
}