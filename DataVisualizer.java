package zybooks;
import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String titleData, column1, column2, dataPoint = " ";
      boolean decision = true;
      
      ArrayList<String> stringData = new ArrayList<String>();
      ArrayList<Integer> integerData = new ArrayList<Integer>();
      
      System.out.println("Enter a title for the data: ");
      titleData = input.nextLine();
      System.out.println("You entered: " + titleData);
      System.out.println("Enter the column 1 header: ");
      column1 = input.nextLine();
      System.out.println("You entered: " + column1);
      System.out.println("Enter the column 2 header: ");
      column2 = input.nextLine();
      System.out.println("You entered: " + column2);
      while(decision){
         System.out.println("Enter a data point (-1 to stop input): ");
         dataPoint = input.nextLine();
         dataPoint = dataPoint.replaceAll("\\s","");
         if (dataPoint.equals("-1"))
            decision = false;
         else{
            boolean validation = inputValidation(dataPoint);
            if (validation == true){
               String[] spliting = dataPoint.split(",");
               String integer = spliting[1];
               int num = Integer.parseInt(integer);
               stringData.add(spliting[0]);
               integerData.add(num);
            }
         }
      }
      infoTable(stringData,integerData,titleData,column1,column2);
      histogram(stringData,integerData);
   }
   public static void infoTable(ArrayList<String> stringData, ArrayList<Integer> integerData, String titleData, String column1,String column2){
      System.out.printf("%33s\n",titleData);
      System.out.printf("%-20s | %23s\n",column1 ,column2);
      System.out.printf("----------------------------------------------\n");
      for(int i = 0; i < integerData.size(); i++){
            System.out.printf("%-20s | %23s\n", stringData.get(i), integerData.get(i));
         }
   }
   public static void histogram(ArrayList<String> stringData, ArrayList<Integer> integerData){
      for(int i = 0; i < stringData.size(); i++){
            System.out.printf("%20s ", stringData.get(i));
            for(int j = 0; j < integerData.get(i); j++)
               System.out.print("*");
            System.out.println();
         }
   }

   public static boolean inputValidation( String dataPoint){
      int count = 0;
      boolean validation = true;
      //dataPoint = dataPoint.replaceAll("\\s","");
         for (int i = 0; i < dataPoint.length(); i++){
            if (dataPoint.charAt(i) == ',' )
               count++;
         }
         if (count < 1){
            System.out.println("Error: No comma in string.");
            validation = false;
         }
         else if (count >1){
            System.out.println("Error: Too many commas in input.");
            validation = false;
         }
         if (count == 1){
            String[] spliting = dataPoint.split(",");
            String integer = spliting[1];
            boolean numeric = true;
            try {
               Integer.parseInt(integer);
            }catch (NumberFormatException e) {
               numeric = false;
            }
            if (numeric == false){
               System.out.println("Error: Comma not followed by an integer.");
               validation = false;
            }
      }
   return validation;
   }
}