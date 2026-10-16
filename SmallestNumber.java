import java.util.Scanner;
public class SmallestNumber {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int numberOne = input.nextInt();
        
        System.out.print("Enter a number: ");
        int numberTwo = input.nextInt();
        
        System.out.print("Enter a number: ");
        int numberThree = input.nextInt();
        
        int smallest = numberOne;
        
        if(numberTwo < smallest)
            smallest = numberTwo;
            
        if(numberThree < smallest)
            smallest = numberThree;
            
            System.out.println("Smallest = " + smallest);
            }
        }
        
        
