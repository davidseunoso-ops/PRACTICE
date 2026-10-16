import java.util.Scanner;
public class Eligibility {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        if (number < 18) {
            System.out.println("Not Eligible.");
            }
            else {
                System.out.println("Eligible.");
                }
            }
        }
