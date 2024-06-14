import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class J1002 {
    public static void main(String[] args) {
        int num = 0;
        try {
            FileWriter f2 = new FileWriter("file2.txt");
            File f1 = new File("file1.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNext()) {
                String str = sc.next() + " "; 
                if (str.equals("word1 ")) {
                    num++;
                    f2.write("word2 ");
                } else {
                    f2.write(str);
                }
            }
            sc.close();
            f2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of replacement = "+num);
    }
}
