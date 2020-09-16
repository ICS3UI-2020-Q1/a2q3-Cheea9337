import java.util.Scanner;

/**
 * Put two numbers in ascending order
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user imput
    Scanner input = new Scanner(System.in);
    
    // get the user's first numbers
    System.out.println("Please enter an integer:");
    int a = input.nextInt();

    // get the user's second numbers
    System.out.println("Please enter another integer:");
    int b = input.nextInt();

    // figure out what the ascending order is
    if (a > b) {
      System.out.println("Your numbers in ascending order are " + b + "," + a);
    } else if (a < b) {
      System.out.println("Your numbers in ascending order are " + a + "," + b);
    } else {
      System.out.println("Your numbers in ascending order are " + a + "," + b);
    }
    



  }
}
