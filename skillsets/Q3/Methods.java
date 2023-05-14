import java.util.Scanner;
import java.util.Properties;
import java.lang.*;

public class Methods 
{
    public static void getRequirements() 
    {
        System.out.println(); // print blank line
        System.out.println("Developer: Carson Darrow" );
        System.out.println("Program swaps two user-entered floating point values.");
        System.out.println("Crate at least two user-defined methods: getRequirements and numberSwap.");
        System.out.println("Must perform data validation: numbers must be floats.");
        System.out.println("Print numbers before/ after swapping.");
        System.out.println(); // print blank line
    }

public static void numberSwap() 
{
    Scanner sc = new Scanner(System.in);
    float num1=0.0f;
    float num2=0.0f;
    float temp=0.0f;

    System.out.print("Enter num1: ");
    while (!sc.hasNextFloat())
        {
            System.out.println("Invalid input!\n");
            sc.next();
            System.out.print("Please try again. Enter num1: ");
        }
    num1 = sc.nextFloat();

    System.out.print("Enter num2: ");
    while (!sc.hasNextFloat())
        {
            System.out.println("Invalid input!\n");
            sc.next();
            System.out.print("Please try again. Enter num2: ");
        }
    num2 = sc.nextFloat();

    System.out.println("\nBefore swap:");
    System.out.println("num1 = " +num1);
    System.out.println("num2 = " +num2);

    temp = num1;

    num1 = num2;

    num2 = temp;

    System.out.println("\nAfter swap:");
    System.out.println("num1 = " +num1);
    System.out.println("num2 = " +num2);

    sc.close();
    }
}
