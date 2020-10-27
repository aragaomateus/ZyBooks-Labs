import java.util.Scanner;

public class TextAnalyzer {
   public static int getNumOfCharacters(final String usrStr) {
      int count = 0;
      for (int i = 0 ; i<usrStr.length();i++)
         count++;
      System.out.println("Number of characters: " + count);
      return count;
   }
   
   public static int outputWithoutWhitespace(final String usrStr){
      String string = usrStr;
      string = string.replaceAll(" ", "");
      System.out.println("String with no whitespace: "+string);
      return 0;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter a sentence or phrase:\n");
      String frase = scnr.nextLine();
      
      System.out.println("You entered: " + frase + "\n");
      
      getNumOfCharacters(frase);
      outputWithoutWhitespace(frase);
      
   }
}
