import javax.swing.*;
import java.util.Random;
public class QuizGame {
    static int userAnswer, correctAnswer;
    static String displayProblem = "";
    public static void main(String[] args) {
        createProblem();
        getUserAnswer();
        checkAnswer();
    }
    public static void showResults(){
        JOptionPane.showMessageDialog(null, displayProblem);
    }
    public static void checkAnswer(){
        if (userAnswer==correctAnswer){
            displayProblem = "You are correct!";
        }else{
            displayProblem = "Incorrect. Try again.";
        }
        showResults();
    }
    public static void getUserAnswer(){
        userAnswer = input(displayProblem);
    }
    public static void createProblem(){
        int choice = input("Choose: \nAddition(1), \nSubtraction(2), \nMultiplication(3), \nDivision(4)");

        if(choice <= 4){
            if (choice >= 1){
                if (choice == 1) {
                    addProblem();
                }
                if (choice == 2){
                    subtProblem();
                }
                if (choice == 3){
                    multProblem();
                }
                if (choice == 4){
                    divideProblem();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Input, run program again.");
                System.exit(0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Input, run program again.");
            System.exit(0);
        }
    }
    public static void addProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1+num2;
        displayProblem = num1 + " + " + num2;
    }
    public static void subtProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1-num2;
        displayProblem = num1 + " - " + num2;
    }
    public static void multProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1*num2;
        displayProblem = num1 + " * " + num2;
    }
    public static void divideProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1/num2;
        displayProblem = num1 + " / " + num2;
    }
    public static int randomNum(){
        Random random = new Random();
        return random.nextInt(20) + 1;
    }
    public static int input(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
}