import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("foutdemo.txt");
            String s = "Hello World";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
