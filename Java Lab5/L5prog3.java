// Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. 
//The program should continue till user enters a word quit""".
// Display the total count of each vowel for all sentences. 

import java.util.*;

  class Countvowel{
    Scanner sc= new Scanner(System.in);
    int countA,countE,countI,countO,countU;
    
    public void counting(){
        while (true){
            System.out.print("Enter any Word (or type 'quit' to exit):");
            String word = sc.nextLine();
            word=word.toLowerCase();
            if(word.equalsIgnoreCase("quit"))
            {
                break;
            }
            for(int i=0;i<word.length();i++)
            {
                switch (word.charAt(i)) {
                    case 'a':
                    countA++;
                        break;
                    case 'e':
                    countE++;
                    break;
                    case 'i':
                    countI++;
                    break;
                    case 'o':
                    countO++;
                    break;
                    case 'u':
                    countU++;
                    break;
                                           }
            }
    
        }
        System.out.println("no. of A in the sentence:"+countA);
        System.out.println("no. of E in the sentence:"+countE);
        System.out.println("no. of I in the sentence:"+countI);
        System.out.println("no. of O in the sentence:"+countO);
        System.out.println("no. of U in the sentence:"+countU);
    }
   
}


public class L5prog3 {
    public static void main(String[] args) {
     Countvowel cv =new Countvowel();
     cv.counting();   
    }
}
