import java.util.Scanner;
public class LargestNumber {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int numberOne = input.nextInt();
        
        System.out.print("Enter a number: ");
        int numberTwo = input.nextInt();
        
        System.out.print("Enter a number: ");
        int numberThree = input.nextInt();
        
        int largest = numberOne;
        
        if(numberTwo > largest)
            largest = numberTwo;
            
        if(numberThree > largest)
            largest = numberThree;
            
            System.out.println("Largest = " + largest);
            }
        }
        
        
