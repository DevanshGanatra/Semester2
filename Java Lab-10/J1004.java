import java.io.*;
import java.util.Scanner;
class Student{

    public void read(){
        try{
            FileInputStream f1 = new FileInputStream("Student1.txt");
            Scanner sc = new Scanner(f1);

            // int i = f1.read();
            while (sc.hasNextLine()) {
                String str = sc.nextLine() + " ";
                System.out.println(str);
            }
            sc.close();
        }
        catch(Exception e){
            System.out.println();
        }
    }
    public void write(){
        try {
            FileInputStream f1 = new FileInputStream("Student1.txt");
            FileOutputStream f2 = new FileOutputStream("Student2.txt");
            Scanner sc = new Scanner(f1);
            String name;
            while (sc.hasNextLine()) {
                name = sc.nextLine() + '\n';
                for (int i = 0; i < name.length(); i++) {
                    f2.write(name.charAt(i));
                }
            }
            sc.close();
            f1.close();
            f2.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class J1004 {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student();

        System.out.println("Reading data from a file : ");
        s1.read();
        
        System.out.println("\nWriting data in a file");
        s1.write();
    }
}
