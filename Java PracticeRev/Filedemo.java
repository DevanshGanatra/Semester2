import java.io.*;

public class Filedemo {
    public static void main(String[] args) {
        File file = new File("Hello.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("New File is created. ");
            } else {
                System.out.println("THis named file already exists. ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
