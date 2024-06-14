
/* Write a program to replace all “word1” by “word2” from a file1, and output is written to file2 file and display
 the no. of replacement */
import java.io.*;
import java.util.*;

public class L10Aprog2 {
    public static void main(String[] args) {
        int num = 0;
        try {
            FileWriter f2 = new FileWriter("HelloProg2.txt");
            File f1 = new File("HelloProg1.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNext()) {
                String str = sc.next(); // Read the next word from the input file
                if (str.equals("plz")) { // Check if the word is "word1"
                    num++;
                    f2.write("piliz "); // Replace "word1" with "word2" in the output file
                } else {
                    f2.write(str + " "); // Write the word to the output file
                }
            }
            sc.close();
            f2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of replacements = " + num);
    }
}
