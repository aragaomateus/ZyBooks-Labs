import java.util.Scanner;

public class LabProgram {
   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon){
      double costDrive = (drivenMiles/milesPerGallon) * dollarsPerGallon;
      System.out.printf("%.2f", costDrive);
      return costDrive;
   }
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double milesGalon = input.nextDouble();
      double dollarsGalon = input.nextDouble();
      drivingCost(10,milesGalon,dollarsGalon);
      System.out.print(" ");
      drivingCost(50,milesGalon,dollarsGalon);
      System.out.print(" ");
      drivingCost(400,milesGalon,dollarsGalon);
      System.out.println("");
   }
}
