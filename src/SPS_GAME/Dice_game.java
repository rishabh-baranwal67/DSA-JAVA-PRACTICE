package SPS_GAME;
import java.util.*;

public class Dice_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userScore = 0;
        int computerScore = 0;
        int rounds = 0;
        while(rounds < 5){
            rounds++;
            int computerDice = (int)(Math.random() * 6) +1;
            int userDice = sc.nextInt();
            if(userDice > computerDice) {
                userScore++;
            }
            else{
                computerScore++;
            }
            System.out.println("Computer Dice Value: " + computerDice);
            System.out.println("User Dice Value: " + userDice);
            if(computerDice < userDice){
                System.out.println("User win!!");
            }
            else if(computerDice == userDice){
                System.out.println("It's a draw");
            }
            else{
                System.out.println("Computer win!!");
            }
        }
        if(userScore > computerScore){
            System.out.println("Congrats! You win");
        }
        else if(userScore == computerScore){
            System.out.println("Computer wins");
        }
        else{
            System.out.println("Both scores are same!");
        }
    }
}
