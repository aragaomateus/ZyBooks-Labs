import java.util.Scanner;

public class LabProgram {
   public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord){
      int count =0;
      for (int i = 0; i < listSize; i++) {
         if (wordsList[i].equals(currWord)) {
            count++;
           }
       }
       
      System.out.println(currWord + " " + count);
      return count;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      String strArray[] = new String[size];
        
      for (int i = 0; i < size; i++) {
           strArray[i] = input.next();
      }
      for (int i = 0; i < size; i++)
         getFrequencyOfWord(strArray,size,strArray[i]);
    
       
   }
}
