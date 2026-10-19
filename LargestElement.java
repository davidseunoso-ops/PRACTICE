public class LargestElement {
    public static void main(String... args) {
    
    int[] numbers = {12, 45, 7, 89, 23};
    
    int largest = numbers[0];
    for (int index = 0; index < numbers.length; index++) {
        if (numbers[index] > largest) {
            largest = numbers[index];
            }
      }
      System.out.println("Largest Element = " + largest);
    }
}
