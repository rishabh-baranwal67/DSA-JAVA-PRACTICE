package FIleHHandeling;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class fileReadWrite {
    public static void main(String[] args) {
        // create a new file
        try{
            File fo = new File("new-file.txt");
            fo.createNewFile();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        try{
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("I am capable of doing the best things");
            fw.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
