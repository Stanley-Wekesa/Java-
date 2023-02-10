import java.io.*;

class ValidScore
{
   public static void main (String args[])
   {   
      try
      {   
         BufferedReader v = new BufferedReader (new InputStreamReader(System.in));
         double score;

         System.out.print ("\nEnter score the student attained: ");
         score = Double.parseDouble(v.readLine());

         if (score >= 0 && score <= 100)
            System.out.println (score + "is a valid score.\n" );
         else 
            System.out.println (score + " is an invalid score.\n ");
      }
      catch(IOException e) {}
    }
}