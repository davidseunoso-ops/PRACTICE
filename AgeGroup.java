import java.util.Scanner;
public class AgeGroup {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        
        int userInput = 100;
        
        if (age > userInput) {
            System.out.println("Invalid Age input. Try again!");
            }
            else if (age > 0 && age < 13) {
                System.out.println("Child");
                }
                else if (age > 12 && age < 20) {
                    System.out.println("Teenager");
                    }
                    else if (age > 19 && age < 71) {
                        System.out.println("Adult");
                        }
                        else if (age > 70 ) {
                            System.out.println("Senior");
                            }
                          }
                        }
                        
