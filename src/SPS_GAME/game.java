package SPS_GAME;
import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int computerInput = rand.nextInt(3);
        System.out.println("Input 0 for stone, 1 for paper and 2 for scissor");
        int userInput = sc.nextInt();

        if(userInput == computerInput){
            System.out.println(" its a tie");
        }
        else if((userInput == 2) && (computerInput == 1) ||
                (userInput == 1 && computerInput == 0) ||
                (userInput == 0 && computerInput == 2)){
            System.out.println("It's a Win!!");
        }
        else{
            System.out.println("Computer win!!!!");
        }
    }
}
