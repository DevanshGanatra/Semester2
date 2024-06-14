import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J1003 {
    public static void main(String[] args) {
        File f1 = new File("J1003.txt");
        int count = 0 ,num = 0;

        try{
            Scanner sc = new Scanner(f1) ;
            while (sc.hasNext()) {
                String str = sc.next();

                try{ 
                     num = Integer.parseInt(str); 
                     
                }
                catch(NumberFormatException e){  continue;  }
                
                if(num == 5){
                    count++;
                }
            }
            System.out.println("count = " + count);

            sc.close();
        }
        
         catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
