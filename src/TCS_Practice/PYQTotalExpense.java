package TCS_Practice;
import java.util.*;
public class PYQTotalExpense {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalI = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        int totalE = 0;
        while(true){
            sc.nextLine();
            String category = sc.nextLine();
//            sc.nextLine();
            if(category.equals("done")){
                break;
            }
            int expense = sc.nextInt();
//            sc.nextLine();
            map.put(category, expense);
            totalE += expense;
        }
        System.out.println("Total Income : " + totalI);
        System.out.println("total expense : " + totalE);
        int savings = totalI - totalE;
        System.out.println("total savings : " + savings);
        System.out.println("All coategories");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("category: " + entry.getKey() + " " + entry.getValue());
        }
    }
}
