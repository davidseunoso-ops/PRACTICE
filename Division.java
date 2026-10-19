import java.util.Scanner;
public class Division {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number % 7 == 0 && number % 2 != 0) {
            System.out.println(number + " is divisible by 7 but not by 2!");
            }
            else {
                System.out.println(number + " is not divisible by 7 but by 2!");
                }
            }
        }
