import java.util.Scanner; 

public class LabProgram {
   public static boolean isLeapYear(int inputYear){
      boolean leapYear = false;
      if(inputYear % 4 == 0)
         {
               if( inputYear % 100 == 0)
               {
                  if ( inputYear % 400 == 0)
                     leapYear = true;
                  else
                     leapYear = false;
               }
               else
                  leapYear = true;
         }
         else {
               leapYear = false;
         }
      return leapYear;
}
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear;
      inputYear = scnr.nextInt();

        if(isLeapYear(inputYear)==true){
            System.out.println(inputYear + " is a leap year.");
        }else{
            System.out.println(inputYear + " is not a leap year.");
        }
   }
}
