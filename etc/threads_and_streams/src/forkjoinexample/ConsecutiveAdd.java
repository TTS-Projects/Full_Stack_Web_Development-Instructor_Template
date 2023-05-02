package forkjoinexample;
import java.util.Scanner;


class ConsecutiveAdd
{
	public static void main(String arg[])	
	{
	    long n;
        Scanner sc =new Scanner(System.in);
		
	    System.out.println("Enter a number :");
	      n = sc.nextLong();
	    
	    System.out.println("Add Up To("+n+") ----->"+addUpTo(n));	  
	}
	
	static long addUpTo(long n)
	{
	   long sum=1;
	   for(int i=1;i<=n;i++)
	   {
		sum=sum+i;
	   }
	   return sum;
        }     
}