
import java.util.*;
public class Dice
{
   public static void main(String[] args)
   {
       int sum = 0;
       for(int i =1; i <=10; i++)
       {
         sum = sum +i;
       } 
       int i = 1; 
       while (i <=10)
       {
          sum = sum + i;
          System.out.println(i);
          i++;
       }
       Scanner kb = new Scanner(System.in);
       diceSum(kb);
         
     
   }
   public static void diceSum(Scanner kb)
   {
      System.out.println("Enter the sum: ");
      int sum = kb.nextInt();
      while (sum  < 0 || sum > 12)
      {
        System.out.println("Enter the sum: ");
        sum = kb.nextInt();
      }  
          
      Random rand = new Random();
      int total = 0;
      int min =1;
      int max = 6;
      int count = 0;
      while (total != sum)
      {
         int num1 = rand.nextInt(max - min +1) + min;
         int num2 = rand.nextInt(max - min +1) + min;
         System.out.print(num1 + "and " + num2);
         total = num1 + num2;
         System.out.println(" = " + total);
         count++;
      } 
      System.out.println("The number of guesses : " + count);  
   
   }
   }   