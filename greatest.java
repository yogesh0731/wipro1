import java.io.*;
import java.lang.Math;
import java.util.Scanner;

	    
public class Greatest 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      int x=43,y=91,z=183;
    
      int p=Math.abs(x-y);
      int q=Math.abs(z-y);
      int w=Math.abs(z-x);
      int gcdNumbers = Greatest.findGCD(p, q, w);
      System.out.println(gcdNumbers);
      sc.close();
   }
   public static int findGCD(int x, int y) 
   {
      if(y == 0)
      {
         return x;
      }
      else
      {
         return findGCD(y, x % y);
      }
   }
   public static int findGCD(int x, int y, int z) 
   {
      return findGCD(findGCD(x, y), z);
   }
}
