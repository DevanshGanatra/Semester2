import java.io.*;
public class J1104 {

    public static String readFile(DataInputStream dis){
        try {
            byte[] data = new byte[dis.available()];
            String dataStr = "";
            for (int b = 0 ; b  < data.length ; b++) {
                data[b] = dis.readByte();
                dataStr +=  (char)data[b];
            }
            System.out.println("Data read !!");
            return dataStr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Problem occured";
    }
    
    public static void writeFile(DataOutputStream dos,String data){
        try {
            byte[] bt = data.getBytes();
            for (int i = 0; i < bt.length; i++) {
                dos.writeChar(bt[i]);
            }
            System.out.println("Data written !!");

        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        File fr = new File("F:\\Rishil\\Study\\Semester 2\\Codes\\Java Codes\\Lab 11\\Text\\Stu1.txt");
        File fw = new File("F:\\Rishil\\Study\\Semester 2\\Codes\\Java Codes\\Lab 11\\Text\\Stu2.txt");
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(fr));
            System.out.println("data reading from a file !");
            String str = readFile(dis);
            dis.close();
            
            System.out.println(str);
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fw));
            System.out.println("data writing in a file !");
            writeFile(dos,str);
            dos.close();
            
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
