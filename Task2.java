import java.util.*;
public class Task2 {
    

    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your marks (less than 100): ");
            int math = sc.nextInt();
            int physics=sc.nextInt();
            int chemistry=sc.nextInt();
            int english=sc.nextInt();
            int hindi=sc.nextInt();
            int sum=math+physics+chemistry+english+hindi;
            int average=sum/5;
    
            char grade;
            if (average >= 80) {
                grade = 'A';
            } else if (average >= 70) {
                grade = 'B';
            } else if (average >= 60) {
                grade = 'C';
            } else if (average >= 50) {
                grade = 'D';
            } else {
                grade = 'E';
            }
    
            System.out.println("Your grade is: " + grade);
        }
    }
    

