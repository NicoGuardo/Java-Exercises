import java.lang.Math;

public class FunWithStrings
{
  
  public static void main(String[] args) {
    
    helloStrings();
    specialChars();
    concatenations();
  }
  
  public static void helloStrings() {
    
    System.out.print("Hello World!" + "\n"); // Obviously, "\n" makes a new line.
    
    System.out.println("Hello" + " " + "World!");
    
    System.out.println("Hello World!");
  }
  
  public static void specialChars() {
    
    System.out.println("\"\\\" is a special character.");
    
    System.out.println("\"\\n\" makes a new line.");
  }
  
  public static void concatenations() {
    
    System.out.println("You can concatenate strings to make beautiful sentences.");
    
    System.out.println("Hello" + " " + "World!");
  }

}
