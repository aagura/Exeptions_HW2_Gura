public class Task2 {
     public static void main(String[] args) {
         int [] intArray = new int[]{1,1,1,1,1};
         try {
             int d = 0;
             double catchedRes1 = intArray[8] / d;
             System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
             System.out.println("Catching exception: " + e);
         }

     }
}
