public class SmallestElement {
    public static void main(String... args) {
    
    int[] numbers = {34, 12, 56, 3, 78, 9};
    
    int smallest = numbers[0];
    for (int index = 0; index < numbers.length; index++) {
        if (numbers[index] < smallest) {
            smallest = numbers[index];
            }
      }
      System.out.println("Smallest Element = " + smallest);
    }
}
