
public class Array {
    public static void main(String[] args) {
       
       
        int[][] numbers = {
            {5, 12, 18},
            {3, 25, 8},
            {30, 10, 15}
        };
        
        
        for (int column = 0; column < numbers[0].length; column++) {
            int count = 0;
            int sum = 0;
            for (int row = 0; row < numbers.length; row++) {
                if (numbers[row][column] % 2 != 0) {
                    sum += numbers[row][column];
                    count++;
                    }
                }
      
      System.out.println("column " + column + ": " + " Sum of odd numbers = " + sum + ", Count = " + count);
                }
            }
        }
    
