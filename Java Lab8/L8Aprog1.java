// Write a method for computing x^y doing repetitive multiplication. X and y are of type integer and are to be given as command line arguments. 
//Raise and handle exception(s) for invalid values of x and y. 
public class L8Aprog1 {
    public static void main(String[] args) {

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int ans = 1;
            for (int i = 1; i <= y; i++) {
                ans *= x;
            }
            System.out.println(ans);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}