public class EvenAndOddNumbers {
    public static void main(String... args) {
    
    int[] numbers = {34, 12, 56, 3, 78, 9};
    
    int countEven = 0;
    int countOdd = 0;
    for (int index = 0; index < numbers.length; index++) {
        if (numbers[index] % 2 == 0) {
            countEven++;
            }
            else {
                countOdd++;
                }   
            }
            System.out.println("Even Numbers = " + countEven);
            System.out.println("Odd Numbers = " + countOdd);
            }
        }
