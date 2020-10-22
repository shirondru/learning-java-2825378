import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        String question = "What is 1+1";
        String choiceOne = "0";
        String choiceTwo = "2";
        String choiceThree = "1";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(correctAnswer.equals(input)){
            System.out.println("Correct that is Correct");
        }
        else {
            System.out.println("That is incorrect");
        }
        // Write a print statement asking the question
        // Write a print statement giving the answer choices

        // Have the user input an answer
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
