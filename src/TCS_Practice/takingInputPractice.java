package TCS_Practice;
import java.util.*;

public class takingInputPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.startsWith("{") && input.endsWith("}")){
            input = input.substring(1, input.length() -1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        String[] strArr = input.split(",");
        for(String s : strArr){
            int num = Integer.parseInt(s);
            list.add(num);
        }
        for(int num : list){
            System.out.print(num + " ");
        }
    }
}
