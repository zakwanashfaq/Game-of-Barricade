import java.io.*;
import java.util.Scanner;
public class v {
    public static void main(String[] args) {
        String path = (System.getProperty("user.dir"))+"/settings.txt";
        File file = new File(path);
        try {
            Scanner scanned_file = new Scanner(file);
            String st = scanned_file.nextLine();
            System.out.println(st);
        }catch (Exception e){
            System.out.println("Error occured while reading settings file2");
        }
    }
}