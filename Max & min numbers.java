import java.util.Scanner; 

public class LabProgram {
   public static int largestNumber(int num1, int num2, int num3){
      if (num1 > num2 && num1 > num3){
         System.out.println("largest: " + num1);
         return num1;
      }else if (num2 > num3 && num2 > num1){
         System.out.println("largest: " + num2);
         return num2;
      }else if (num3 > num1 && num3 > num2){
         System.out.println("largest: " + num3);
         return num3;
      }
      return 0;
   }
   public static int smallestNumber(int num1, int num2, int num3){
      if (num1 < num2 && num1 < num3){
         System.out.println("smallest: " + num1);
         return num1;
      }else if (num2 < num3 && num2 < num1){
         System.out.println("smallest: " + num2);
         return num2;
      }else if (num3 < num1 && num3 < num2){
         System.out.println("smallest: " + num3);
         return num3;
      }
      return 0;
   }
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int num1 = input.nextInt();
     int num2 = input.nextInt();
     int num3 = input.nextInt();
     
     largestNumber(num1,num2,num3);
     smallestNumber(num1,num2,num3);
   }
}
