package MultiThreading;

import java.util.*;
import java.io.*;

public class exm {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String[] parts = name.split(" ");
        int[] sorted = new int[parts.length];
        for(int i = 0; i < parts.length; i++){
            sorted[i] = Integer.parseInt(parts[i].trim());
        }
        System.out.println(Arrays.toString(sorted));
    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int row = 3;
//        int col = 2;
//        String[] parts = str.split(",");
//        int[][] matrix = new int[row][col];
//        int k = 0;
//        for(int i = 0; i < row; i++){
//            for(int j = 0; j < col; j++){
//                matrix[i][j] = Integer.parseInt(parts[k++].trim());
//            }
//        }
//        for(int i = 0; i < row; i++){
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
////        line = line.replaceAll("\\[|\\]", "");
//        String[] arr = line.split(",");
//        int[] array = new int[arr.length];
//
//        for(int i = 0; i < arr.length; i++){
//            array[i] = Integer.parseInt(arr[i]);
//        }
//        System.out.println(Arrays.toString(array));
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String  line = sc.nextLine();
//        line = line.replaceAll("\\[|\\]", "");
//        String[] parts = line.split(",");
//
//        System.out.println(Arrays.toString(parts));
//    }

    // for removing digits from a floating point number
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        double num = sc.nextDouble();
//        System.out.printf("%.2f", num);
//    }
}
