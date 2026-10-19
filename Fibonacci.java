public class Fibonacci {
    public static void main(String[] args) {
    
        int first = 0;
        int second = 1;
        
        for (int index = 1; index <= 10; index++) {
            System.out.print(first + " ");
            
            int next = first + second;
              
                first = second;
                second = next;
                }
            }
        }
