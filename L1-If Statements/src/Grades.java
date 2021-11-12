import java.util.Scanner;

public class Grades {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String grade = "";

        System.out.print("Please enter your percentage grade:");
        double percentage = read.nextDouble();

        if(percentage < 60){
            System.out.println("Your grade is F" + grade);
        }

        if(percentage >= 60){
            if(percentage < 70) {
                System.out.println("Your grade is D" + grade);
            }
        }

        if(percentage >= 70){
            if(percentage < 80) {
                System.out.println("Your grade is C" + grade);
            }
        }

        if(percentage >= 80){
            if(percentage < 90) {
                System.out.println("Your grade is B" + grade);
            }
        }

        if(percentage >= 90){
            System.out.println("Your grade is A" + grade);
        }

    }
}