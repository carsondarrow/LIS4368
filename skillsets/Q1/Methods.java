import java.util.Scanner;
import java.util.Properties;
import java.lang.*;

public class Methods 
{
    public static void getRequirements() 
    {
        System.out.println(); // print blank line
        System.out.println("Developer: Carson Darrow" );
        System.out.println("Program lists system properties.");
        System.out.println(); // print blank line
    }

public static void systemProp() {
   
    System.out.println("System file path separator; " + System.getProperty("file.separator"));
    System.out.println("Java class path: " + System.getProperty("java.class.path"));
    System.out.println("java installation directory: " + System.getProperty("java.home"));
    System.out.println("java vendor name: " + System.getProperty("java.vm.vendor"));
    System.out.println("java vendor URL: https://java.oracle.com/");
    System.out.println("java version number: " + System.getProperty("java.version"));
    System.out.println("JRE version: 17.0.5");
    System.out.println("OS architecture: " + System.getProperty("os.arch"));
    System.out.println("OS name: " + System.getProperty("os.name"));
    System.out.println("OS version: " + System.getProperty("os.version"));
    System.out.println("Path separator used in java.class.path: "  );
    System.out.println("User working directory: " + System.getProperty("user.dir"));
    System.out.println("User home directory: " + System.getProperty("user.home"));
    System.out.println("User account name: " + System.getProperty("user.name"));

}

}
