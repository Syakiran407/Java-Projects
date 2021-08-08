import java.text.DecimalFormat;
import java.util.Arrays;

public class Basic {
    //Every public class has to be in its own file
    //There are four access modifier in Java:
    //1. public (accessible anywhere)
    //2. package-private (accessible anywhere in the package)
    //3. protected (package-private plus accessible from any subclass, even in different package)
    //4. private (accessible only from its class)

    public static void main (String [] args) {
        // static means class level don't need an object to invoke
        // static means no "this" reference
        // String[] is the data type for the parameter args
        // args is parameter to store command line arguments

        System.out.println(args.length); // the length here is a field, see line 43

        // VARIABLES
        // 8 primitives in JAVA
        // 1. char
        char myChar = 'a';
        System.out.println("myChar: " + myChar);
        // 2. int
        // 3. double
        double myDouble = Math.PI;
        // the Math class in Java.lang package, which you get imported for free
        System.out.println("myDouble: " + myDouble);
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println(df.format(myDouble));
        // 4. boolean
        boolean myBool = true; // or false
        System.out.println("myBool " + myBool);
        // 5. short 6. long 7. float 8. byte

        // if the variable is not primitive, then it is a reference
        // a String is a class in Java, anytime we're using String, we use objects
        // variables can be reference to the String objects
        // STRINGS
        String myString = "Hello World";
        System.out.println("myString: " + myString);
        // because String is a class, we have access to several members of the String class
        System.out.println(myString.length()); // the length here is a method
        // equals() compareTo trim() split()
        // More information about Strings in Java https://www3.ntu.edu.sg/home/ehchua/programming/java/J3d_String.html

        int[] myInt = {1, 2, 3, 4, 5};
        System.out.println(myInt);
        System.out.println(Arrays.toString(myInt));
    }
}
