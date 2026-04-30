package TCS_Practice;
import java.util.*;

public class PYQString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();
        for(char ch : s.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        for(char ch : s.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch, 0) +1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey() + " : " + entry.getValue());
                break;
            }
        }
        int mostR = -1;
        char mostRC = ' ';
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > mostR){
                mostR = entry.getValue();
                mostRC = entry.getKey();
            }
        }
        System.out.println("most repeating character is : " + mostRC);
        System.out.println("3rd case :" );

        for(Map.Entry<Character, Integer> entry : map2.entrySet()){
            System.out.print(entry.getKey() + " ");
        }
        if(s.length() == 0){
            System.out.println("invalid Input");
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(map.size() == 1){
                System.out.println("None : " + entry.getKey());
            }
        }
    }
}
