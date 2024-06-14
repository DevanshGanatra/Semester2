import java.io.*;
public class WriterDemo {
    public static void main(String[] args) {
        try{
            Writer w=new FileWriter("Hello.txt");
            w.write("Im Learning.");
            w.close();
            System.out.println("Success...");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}