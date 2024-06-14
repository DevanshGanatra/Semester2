import java.io.*;

public class J1101 {

    private static String read(Reader r1) {
        try {
            BufferedReader red = new BufferedReader(r1);
            int temp = red.read();
            String str = "";
            while (temp != -1) {
                System.out.print((char) temp);
                str += (char) temp;
                temp = red.read();
            }
            red.close();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }

    private static void write(Writer w1,String s) {

        try {
            BufferedWriter wr = new BufferedWriter(w1);
            for (int i = 0; i < s.length(); i++) {
                wr.append(s.charAt(i));
            }
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            File f1 = new File("F:\\Rishil\\Study\\Semester 2\\Codes\\Java Codes\\Lab 11\\Text\\Stu1.txt");
            Reader r1 = new FileReader(f1);
            System.out.println("Reading Form File...");
            String s = read(r1);

            r1.close();
            if (!s.equals("")) {
                f1 = new File("F:\\Rishil\\Study\\Semester 2\\Codes\\Java Codes\\Lab 11\\Text\\Stu2.txt"); 
                Writer w1 = new FileWriter(f1);
                System.out.println("\nWriting In File");
                write(w1 , s);
                w1.close();
            } else {
                System.out.println("some error occured !");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}