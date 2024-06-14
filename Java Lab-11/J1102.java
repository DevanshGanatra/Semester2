import java.io.File;
public class J1102 {
    public static void main(String[] args) {
        File fl = new File(args[0]);

        if(fl.isFile()){
            System.out.println("File's size =" + fl.length());
            
        }
        else{
            System.out.println("Files in directory : ");
            String[] str = fl.list();
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
            }
        }
        
    }
}
