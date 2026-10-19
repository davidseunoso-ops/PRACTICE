import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int firstNumber = input.nextInt();
        
         System.out.print("Enter a number: ");
         int secondNumber = input.nextInt();
         
         int total = firstNumber + secondNumber;
         int subtract = firstNumber - secondNumber;
         int product = firstNumber * secondNumber;
         double division = firstNumber / secondNumber;
         
         System.out.println("Total = " + total);
         System.out.println("Subtraction = " + subtract);
         System.out.println("Product = " + product);
         System.out.println("Division = " + division);
         }
      }
  
