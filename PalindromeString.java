public class PalindromeString {
    public static void main(String[] args) {
    
    String original = "madam";
    String reverse = "";
    
    for (int index = original.length() - 1; index >= 0; index--) {
        reverse += original.charAt(index);
        } 
        if (original.equals(reverse)) {
            System.out.println(original + " is a Palindrome.");
            }
            else {
                System.out.println(original + " is not a Palindrome.");
                }
            }
        }
