import java.util.Scanner;
import java.util.Random;
class FinalPrime
{
   public static void main (String[] args)
   {		
      Scanner scanner = new Scanner(System.in);
      int i =0;
      int num =0;
      String  primeNumbers = "";
	  //int array[] ={1,2,3,4,5,6,7,8,9,10};
      int array[] =new int[4000000];
      //System.out.println("Enter the value of n:");
	   Random rand = new Random(); 
	 
	   for(i=0;i<array.length;i++)
    {
        array[i] = rand.nextInt(100000);
    }
      //int n = scanner.nextInt();
     //
	 for (i = 0; i <=array.length-1; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =array[i]; num>=1; num--)
         {
	    if(array[i]%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    primeNumbers = primeNumbers + array[i] + " ";
	 }	
      }
	   for(i=0;i<array.length;i++)
    {
	//System.out.print("   arrray   "+array[i]);
        //array[i] = randomFill();
    }
    
      System.out.println("Prime numbers are :");
      System.out.println(primeNumbers);
   }
}