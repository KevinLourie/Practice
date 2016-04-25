import java.util.*;
public class guessWeight
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in);
      /*System.out.println("Enter the count:");
      int count = kb.nextInt();
      
      int[] weight =  new int[count];
      System.out.println(weight);
      populate(kb,weight);
      double av = avg(weight);
      int[] result = aboveBelow(weight,av);
      System.out.println(Arrays.toString(result));
      */int x = 6;
      int[] weight =  new int[3];
      populate(kb,weight);
      System.out.println(Arrays.toString(weight));
      test(x);    
   }
   public static void test(int z )
   {
   }
   public static void populate(Scanner kb, int[] w)
   {
     //System.out.println(w);
     for(int i =0; i < w.length; i++)
     {
        System.out.println("Enter the weight:");
        w[i] = kb.nextInt();
     } 
     w[0]=100;  
   }
   public static double avg(int[] w)
   {
      double sum =0;
      for(int i =0; i <w.length; i++)
      {
          sum = sum + w[i];
      }
      return sum/w.length;
          
   }
   public static int[] aboveBelow(int[] w,double avg)
   {
     int above =0;
     int below = 0;
      for(int i =0; i < w.length; i++)
      {
        if (w[i] > avg)
           above++;
        else
           below++;
      }
      int[] result = {above, below};
      return result;
              
   }
}   