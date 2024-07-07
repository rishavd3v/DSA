import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("HElllo");
            FileReader fr = new FileReader("FileHandling/src/notes.txt");
            while(fr.ready()){
                int s = fr.read();
                char ch = (char) s;
                System.out.print(ch);
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}