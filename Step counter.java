import java.util.Scanner;

public class LabProgram {
   public static double stepsToMiles(double userSteps){
      double stepMiles = userSteps / 2000;
      return stepMiles;
   }
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      double userSteps = input.nextDouble();
      
      System.out.printf("%.2f",stepsToMiles(userSteps));
   }
}
