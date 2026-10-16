import java.util.Scanner;
public class DivisionTwo {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        if (number % 3 == 0 || number % 5 == 0) {
            System.out.println(number + " is divisible by 3 Or 5");
            }
            else {
                System.out.println(number + " is not divisible by 3 or 5");
                }
            }
        }
