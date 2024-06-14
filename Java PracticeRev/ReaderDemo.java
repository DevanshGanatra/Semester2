import java.io.*;
public class ReaderDemo {
    public static void main(String[] args) {
        try{
            Reader r=new FileReader("foutdemo.txt");
            int i=r.read();
            while(i!=-1)
            {
                char dataChar=(char)i;
                System.out.print(dataChar);
                i=r.read();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
