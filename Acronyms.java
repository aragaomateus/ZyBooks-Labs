import java.util.Scanner;

public class LabProgram {
   public static String createAcronym(String userPhrase){
      String sigla = "";
      for (int i = 0; i < userPhrase.length(); i++){
         if (Character.isUpperCase(userPhrase.charAt(i)))
            sigla = sigla + userPhrase.charAt(i);
      }
      return sigla;
   }
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      String phrase = input.nextLine();
      
      System.out.println(createAcronym(phrase));
      
   }
}
