import java.util.Scanner; 

public class LabProgram {
   public static boolean isArrayEven(int[] arrayValues, int arraySize){
      boolean even = true;
      for (int i = 0; i < arraySize; i++){
         if (arrayValues[i]%2 == 0)
            even = true;
         else {
            even = false;
            break;
         }
      }
      return even;
   }
   public static boolean isArrayOdd(int[] arrayValues, int arraySize){
      boolean odd = true;
      for (int i = 0; i < arraySize; i++){
         if (arrayValues[i]%2 == 1)
            odd = true;
         else {
            odd = false;
            break;
         }
      }
      return odd;
   }
   
   public static void main(String[] args) {
      int [] array = new int[20];
      
      Scanner input = new Scanner(System.in);
      
      int size = input.nextInt();
      for (int i = 0; i < size; i++){
         array[i] = input.nextInt();
      }
      
      if ( isArrayEven(array,size) == true && isArrayOdd(array,size) == false){
         System.out.println("all even");  
      }else if ( isArrayEven(array,size) == false && isArrayOdd(array,size) == true){
         System.out.println("all odd");  
      }else if ( isArrayEven(array,size) == false && isArrayOdd(array,size) == false){
         System.out.println("not even or odd");  
      }
      
   }
}
