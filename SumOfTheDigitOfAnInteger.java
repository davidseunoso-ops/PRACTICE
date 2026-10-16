import java.util.Scanner;
public class SumOfTheDigitOfAnInteger {
    public static void main(String... args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an Integer: ");
      int integer = input.nextInt();
      
      int digits = Math.abs(integer);
      int sum = 0;
      
      while (digits > 0) {
          int lastDigit = digits % 10;
              sum += lastDigit;
              digits /= 10;
              }
              System.out.println(sum);
          }
      }
