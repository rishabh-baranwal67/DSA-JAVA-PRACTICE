//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

import static java.lang.Math.*;

public class Main {
        public static void main(String[] args) {

            String[] stringArray = {"banana", "apple", "orange", "grape"};

            Arrays.sort(stringArray);

            System.out.println("Sorted array:");
            for (String str : stringArray) {
                System.out.println(str);
            }
        }
    }

//    public static String removeExtraSpaces(String text) {
//        return text.trim().replaceAll("\\s+", " ");
//    }
//
//    public static void CollectionsClass(String[] args) {
//        String textWithExtraSpaces = "  Hello   world!  ";
//        String textWithoutExtraSpaces = removeExtraSpaces(textWithExtraSpaces);
//        System.out.println("Original text: \"" + textWithExtraSpaces + "\"");
//        System.out.println("Text without extra spaces: \"" + textWithoutExtraSpaces + "\"");
//    }
//}
//    public static void CollectionsClass(String[] args) {
//        String str = "Geeks for      Geeks";
//
//        String str1 = str.replace("[^ ]");
//        String strArray[] = str.split(" ");
//        System.out.println(strArray.length);
//
//        System.out.println("String : " + str);
////        System.out.print("String array : [ ");
//
//        // Iterating over the string
//        for (int i = 0; i < strArray.length; i++) {
//            // Printing the elements of String array
//            System.out.print(strArray[i] + " ");
//        }
//
////        System.out.print("]");
//    }
//}