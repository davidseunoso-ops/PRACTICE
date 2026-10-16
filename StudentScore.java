import java.util.Scanner;
public class StudentScore {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your score: ");
        double studentScore = input.nextDouble();
        
        int score = 100;
        if (studentScore > score) {
            System.out.println("Decline. Enter a valid score!");
            }
            else if (studentScore >= 70) {
                System.out.println(studentScore + " Grade: A");
                }
                else if (studentScore >= 60) {
                    System.out.println(studentScore + " Grade: B");
                    }
                    else if (studentScore >= 50) {
                        System.out.println(studentScore + " Grade: C");
                        }
                        else if (studentScore >= 45) {
                            System.out.println(studentScore + " Grade: D");
                            }
                            else if (studentScore >= 40) {
                                System.out.println(studentScore + " Grade: E");
                                }
                                else if (studentScore < 40) {
                                     System.out.println(studentScore + " Grade: F");
                                    }
                                    
                                    }
                               }
                 
            
