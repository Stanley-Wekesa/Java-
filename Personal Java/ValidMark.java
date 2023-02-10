import java.io.*;

class ValidMark
{
   public static void main (String args[])
   {   
      try
      {   
         BufferedReader v = new BufferedReader (new InputStreamReader(System.in));
         double mark;

         System.out.print ("\nEnter marks the student attained: ");
         mark = Double.parseDouble(v.readLine());

         if (mark >= 0 && mark <= 100)
            System.out.println (mark + "is a valid mark.\n" );
         else 
            System.out.println (mark + " is an invalid mark.\n ");
      }
      catch(IOException e) {}
    }
}