package SPS_GAME;
import java.util.*;
public class Number_guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = (int)(Math.random() * 100 + 1);

        System.out.println("Guess a number <= 100");
        int no_of_trial = 0;
        while(no_of_trial < 10){
            int guess = sc.nextInt();
            no_of_trial++;
            if(no_of_trial == 10){
                System.out.println(" you trial is completed! Better luck , next time");
            }
            else if(guess == number){
                System.out.println("Congrats! its a match");
                System.out.println("Number of Trial :" + no_of_trial);
                break;
            }
            else if(guess > number){
                System.out.println("try again : Your guess is to high");
            }
            else{
                System.out.println("try again : Your guess is too low");
            }

        }
    }
}
