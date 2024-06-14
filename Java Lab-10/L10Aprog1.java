/*Write a program that counts number of characters, words, and lines in a file.
 Use exceptions to check whether the file that is read exists or not */
import java.io.*;
import java.util.*;
public class L10Aprog1{
public static void main(String[] args) {

        File f1 = new File("HelloProg1.txt");
        int lines = 0;
        int words = 0;
        int chars = 0;
        try {
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines++;
                words += line.split("\\s+").length;
                chars += line.length();
            }
            sc.close();
            System.out.println("Lines = " + lines);
            System.out.println("Characters = " + chars);
            System.out.println("Words = " + words);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
}
}