package TCS_Practice;
import java.io.*;
public class inoutBufferReader {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        double b = Double.parseDouble(br.readLine());
        String s = br.readLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
    }
}
