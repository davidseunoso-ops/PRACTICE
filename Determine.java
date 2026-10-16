import java.util.Scanner;
public class Determine {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
          System.out.print("Enter a number: ");
          int number = input.nextInt();
          
          if ((number & 1) != 0) {
              System.out.println(number + " is an odd number.");
              }
              else {
                  System.out.println(number + " is an even number.");
                  }
              }
          }
