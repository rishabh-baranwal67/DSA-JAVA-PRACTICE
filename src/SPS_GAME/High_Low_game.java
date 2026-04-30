package SPS_GAME;
import java.util.*;

public class High_Low_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Random rand = new Random();

        System.out.println("Choose a number between 0 - 10");
        int userInput = sc.nextInt();
//        int computerInput = rand.nextInt(10);
        int computerInput = (int)(Math.random() * 10);

        if(userInput == computerInput){
            System.out.println("It's a draw");
        }
        else if(userInput > computerInput){
            System.out.println("it's a win!!!");
        }
        else{
            System.out.println("Computer win!!!");
        }
        System.out.println("computer input : "  + computerInput);
        System.out.println("user input : " + userInput);
    }
}
