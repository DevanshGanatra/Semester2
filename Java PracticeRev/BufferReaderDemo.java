import java.io.*;
public class BufferReaderDemo {
    public static void main(String[] args) {
        try{

            FileReader fr=new FileReader("haalBufferiya.txt");
            BufferedReader br=new BufferedReader(fr);
            while (br.ready()) {
                System.out.println(br.readLine());
            }
            br.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
