import java.util.Scanner;
public class PositiveIntegers {
    public static void main(String... args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int numbers = input.nextInt();
        
        int positive = numbers;
        int count = 0;
        
        if (positive == 0) {
            count = 1;
            }
            while (positive > 0) {
                positive /= 10;
                count++
                }
                System.out.println(count);
                  }
              }
              
              
              
              
