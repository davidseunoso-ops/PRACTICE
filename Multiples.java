import java.util.Scanner;
public class Multiples {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the First Number: ");
        int firstNumber = input.nextInt();
        
        System.out.print("Enter the Second Number: ");
        int secondNumber = input.nextInt();
        
        if (firstNumber * firstNumber == secondNumber) {
            System.out.println(firstNumber + " is a multiple of " + secondNumber);
            }
            else if (secondNumber * secondNumber == firstNumber) {
                System.out.println(secondNumber + " is a multiple of " + firstNumber);
                }
                else {
                    System.out.print(firstNumber + " is not a multiple of " + secondNumber + " and " + secondNumber + " is not a multiple of " + firstNumber);
                    }
            }
        }
                
