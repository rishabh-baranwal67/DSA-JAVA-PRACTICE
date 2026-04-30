package string_and_recursion;

import java.util.Random;
import java.util.Scanner;

public class Transaction {
    String sender;
    String reciever;
    double amount;
    int time;
    Transaction(String s, String r, double a, int t){
        sender = s;
        reciever = r;
        amount = a;
        time = t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Transaction[] arr = new Transaction[n];
        for(int i = 0; i < n; i++){
            String s = sc.next();
            String r = sc.next();
            double a = sc.nextDouble();
            int t = sc.nextInt();
            arr[i] = new Transaction(s,r,a,t);
        }
        for(int i = 0; i <arr.length; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i].reciever.equals(arr[j].reciever) &&
                        arr[i].sender.equals(arr[j].sender) &&
                        arr[i].amount == arr[j].amount &&
                        Math.abs(arr[i].time - arr[j].time) <= 60){
                    // print both transactions
                    System.out.println(arr[i].sender + " " + arr[i].reciever + " " +
                            arr[i].amount + " " + arr[i].time);

                    System.out.println(arr[j].sender + " " + arr[j].reciever + " " +
                            arr[j].amount + " " + arr[j].time);
                }
            }
        }
    }
}
//class Main{

//}
