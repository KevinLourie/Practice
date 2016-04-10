import java.util.*;
public class Lottery
{
   public static void main(String[] args)
   {
      int won =0;
      for(int i =1; i<=4; i++)
      {
         int c = computer();
         int u = user();
         System.out.println("Computer : "+ c);
         System.out.println("User: "+ u);
         int win = result(c,u);
         won = won + win; 
             
         System.out.println(win);
      } 
      System.out.println(" you won " + won + " $");  
   }
   public static int compare(int num)
   {
      int a = 0;
      switch(num)
      {
         case 100 : a++ ;
                    break; 
         case 150: a = a*9;
                   break;
          default : a = -1;
      } 
      return a;
    }               
    public static int computer()
   {
     Random rand = new Random();
     int min = 10;
     int max = 99;
     int num = rand.nextInt(max - min + 1) +10;
     //System.out.println(num);
     return num;
   }
   public static int user()
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter a two digits number :");
      int num = kb.nextInt();
      return num;
    } 
    public static int result(int c, int u)
    {
        String co = c + "";
        String us = u + "";
        char c0 = co.charAt(0);
        char c1 = co.charAt(1);
        char u0 = us.charAt(0);
        char u1 = us.charAt(1);
        
        if (c == u)
        {
            return 5000;
        }
        else if ( u0 == c1 && u1 == c0)
        {
           return 4000;
        }
        else if( c0 == u0 || c1 == u1) 
        {
            return 3000;
        }
        else if (c0 == u1 || c1 == u0)
        {
            return 2000;
        }
        else
        {
            return 0;
        }                      
        
    } 
}   