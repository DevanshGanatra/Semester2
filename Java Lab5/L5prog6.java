// WAP that counts the number of objects created using static
public class L5prog6 {
        static int count=0;
        L5prog6(){
            count++;
        }
        L5prog6(int a){
            count++;
        }
        public static void main(String[] args) {
            L5prog6 one =new L5prog6();
            L5prog6 two =new L5prog6(5);
            System.out.println(count);
        }
}
