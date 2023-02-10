import java.util.Scanner;

class VotingThree
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int age;

      System.out.println("\nEnter your age:> ");
      age = myScanner.nextInt();

      if(age >= 18)
      {
         System.out.println("You can vote");
         System.out.println("Please vote wisely");
      }
   }
}
